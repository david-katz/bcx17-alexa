/**
 * null
 */
package bcx17.model.transform;

import java.math.*;

import javax.annotation.Generated;

import bcx17.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostPushupDetectedResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostPushupDetectedResultJsonUnmarshaller implements Unmarshaller<PostPushupDetectedResult, JsonUnmarshallerContext> {

    public PostPushupDetectedResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostPushupDetectedResult postPushupDetectedResult = new PostPushupDetectedResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postPushupDetectedResult;
        }

        while (true) {
            if (token == null)
                break;

            postPushupDetectedResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postPushupDetectedResult;
    }

    private static PostPushupDetectedResultJsonUnmarshaller instance;

    public static PostPushupDetectedResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostPushupDetectedResultJsonUnmarshaller();
        return instance;
    }
}
