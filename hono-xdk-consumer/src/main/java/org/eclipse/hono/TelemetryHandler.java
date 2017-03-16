package org.eclipse.hono;

import org.eclipse.hono.util.MessageHelper;

import bcx17.KneeBends;
import bcx17.KneeBendsClientBuilder;
import bcx17.model.PostPushupDetectedRequest;
import io.vertx.core.json.JsonObject;

import org.apache.qpid.proton.amqp.messaging.AmqpValue;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.message.Message;

public class TelemetryHandler {

	boolean buttonPushed = false;

	enum State {
		STARTED, CALIBRATE_HIGH, CALIBRATE_LOW, CALIBRATED, ARMS_UP, ARMS_HALF_WAY_DOWN, ARMS_DOWN, ARMS_ALL_WAY_UP_AGAIN
	}

	State state = State.CALIBRATE_HIGH;
	double barometerHigh = 0;
	double barometerLow = 0;
	double barometerDiff = 0;
	double magnetometerHigh = 0;
	double magnetometerLow = 0;
	private KneeBends kneeBendsProxy;

	public TelemetryHandler() {
		KneeBendsClientBuilder builder = KneeBends.builder();
		builder.setApiKey("64yHdLKCT77S0741RawXY4ZJ6tRtZsfz2cRgMABW");
		builder.setEndpoint("https://efvp0jra7k.execute-api.eu-central-1.amazonaws.com/prod/pushupDetected");
		kneeBendsProxy = builder.build();
	}
	
	public void handleTelemetryMessage(final Message msg) {
		final Section body = msg.getBody();
		String content = null;
		if (!(body instanceof Data))
			return;

		content = ((Data) msg.getBody()).getValue().toString();

		final String deviceId = MessageHelper.getDeviceId(msg);

		if (!deviceId.equals("xdk.f4b85e05e701")) {
			return;
		}

		validateButton(msg);
		validateBarometer(msg);
//		validateMagnetometer(msg);

		// StringBuilder sb = new StringBuilder("received message [device: ").
		// append(deviceId).append(", content-type:
		// ").append(msg.getContentType()).append(" ]: ").append(content);
		//
		// if (msg.getApplicationProperties() != null) {
		// sb.append(" with application properties:
		// ").append(msg.getApplicationProperties().getValue());
		// }
		//
		// System.out.println(sb.toString());
	}

	private void validateMagnetometer(final Message msg) {
		JsonObject jsonPayload = MessageHelper.getJsonPayload(msg);
		String feature = jsonPayload.getString("path");
		if (!feature.equals("/features/magnetometer_0")) {
			return;
		}

		// System.out.println("MMMMMMMMMMMMM "+jsonPayload.encodePrettily());

		JsonObject value = jsonPayload.getJsonObject("value");
		JsonObject properties = value.getJsonObject("properties");
		JsonObject status = properties.getJsonObject("status");

		double zValue = status.getDouble("z_value");

		if (buttonPushed) {
			switch (state) {
			case CALIBRATE_HIGH:
				magnetometerHigh = zValue;
				break;
			case CALIBRATE_LOW:
				magnetometerLow = zValue;
				break;
			}
		}

		System.out.println("magnetometer z_value: " + zValue + " [" + magnetometerLow + " : " + magnetometerHigh + "]");

	}

	private void validateBarometer(final Message msg) {
		JsonObject jsonPayload = MessageHelper.getJsonPayload(msg);
		String feature = jsonPayload.getString("path");
		if (!feature.equals("/features/barometer_0")) {
			return;
		}

		// System.out.println("BBBBBBBBBBBB "+jsonPayload.encodePrettily());

		JsonObject value = jsonPayload.getJsonObject("value");
		JsonObject properties = value.getJsonObject("properties");
		JsonObject status = properties.getJsonObject("status");

		double sensorValue = status.getDouble("sensor_value");

		
		switch (state) {
		case CALIBRATE_HIGH:
			barometerHigh = sensorValue;
			barometerDiff = barometerLow - barometerHigh;
			break;
		case CALIBRATE_LOW:
			barometerLow = sensorValue;
			barometerDiff = barometerLow - barometerHigh;
			break;
		case CALIBRATED:
			if (isArmsUp(sensorValue)) {
				state = State.ARMS_UP;
			}
			break;
		case ARMS_UP:
			if(isArmsMid(sensorValue)) {
				state = State.ARMS_HALF_WAY_DOWN;
			} else if(isArmsDown(sensorValue)) {
				state = State.ARMS_DOWN;
			}
			break;
		case ARMS_HALF_WAY_DOWN:
			if(isArmsUp(sensorValue)) {
				state = State.ARMS_UP;
				System.out.println("HALF DONE");
				PostPushupDetectedRequest pushupRequest = new PostPushupDetectedRequest();
				pushupRequest.setFull("false");
				kneeBendsProxy.postPushupDetected(pushupRequest);
			} else if (isArmsDown(sensorValue)) {
				state = State.ARMS_DOWN;
			}
			break;
		case ARMS_DOWN:
			if(isArmsUp(sensorValue)) {
				state = State.ARMS_UP;
				PostPushupDetectedRequest pushupRequest = new PostPushupDetectedRequest();
				pushupRequest.setFull("true");
				kneeBendsProxy.postPushupDetected(pushupRequest);
			}
			break;
		}
		
		
		
		
//		if (state == State.CALIBRATE_HIGH) {
//			barometerHigh = sensorValue;
//			barometerDiff = barometerLow - barometerHigh;
//		} else if (state == State.CALIBRATE_LOW) {
//			barometerLow = sensorValue;
//			barometerDiff = barometerLow - barometerHigh;
//		} else if (isArmsUp(sensorValue)) {
//			if (state == State.ARMS_HALF_WAY_DOWN) {
//				System.out.println("HALF DONE");
//			} else if (state == State.ARMS_DOWN) {
//				System.out.println("WELL DONE");
//			}
//			state = State.ARMS_UP;
//		} else if (isArmsMid(sensorValue)) {
//			if (state == State.ARMS_UP) {
//				state = State.ARMS_HALF_WAY_DOWN;
//			}
//		} else if (isArmsDown(sensorValue)) {
//			if (state == State.ARMS_HALF_WAY_DOWN) {
//				state = State.ARMS_DOWN;
//			}
//		}
		System.out
				.println(state+" barometer sensor_value: " + sensorValue + " [" + barometerLow + " : " + barometerHigh + "] diff: "+barometerDiff);

	}

	boolean isArmsUp(double barometerValue) {
		if (doubleEquals(barometerValue, barometerHigh, barometerDiff / 8d)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isArmsDown(double barometerValue) {
		if (doubleEquals(barometerValue, barometerLow, barometerDiff / 8d)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isArmsMid(double barometerValue) {
		if (doubleEquals(barometerValue, (barometerLow+barometerHigh)/2d, barometerDiff / 8d)) {
			return true;
		} else {
			return false;
		}
	}

	
	boolean doubleEquals(double a, double b, double precision) {
		if (Math.abs(a-b) < precision) {
			return true;
		} else {
			return false;
		}
	}

	private void validateButton(final Message msg) {
		JsonObject jsonPayload = MessageHelper.getJsonPayload(msg);
		String feature = jsonPayload.getString("path");
		if (!feature.equals("/features/alert_notification_0")) {
			return;
		}
		// {"status":{"alert":"Button Alert:1489569977:Button-1
		// Release:MEDIUM:BTN1"}}}}

		// System.out.println("BBBBBBBBBBBB "+jsonPayload.encodePrettily());

		JsonObject value = jsonPayload.getJsonObject("value");
		JsonObject properties = value.getJsonObject("properties");
		JsonObject status = properties.getJsonObject("status");
		String alert = status.getString("alert");
		String[] alertSplit = alert.split(":");
		int alertId = Integer.parseInt(alertSplit[1]);
		String alertEvent = alertSplit[2];
		if (alertEvent.contains("Release")) {
			if (state == State.CALIBRATE_HIGH) {
				state = State.CALIBRATE_LOW;
			} else if (state == State.CALIBRATE_LOW) {
				state = State.CALIBRATED;
			}
			buttonPushed = false;
		} else if (alertEvent.contains("Push")) {
			if (state != State.CALIBRATE_HIGH && state != State.CALIBRATE_LOW) {
				state = State.CALIBRATE_HIGH;
			}
			buttonPushed = true;
		}

	}
}
