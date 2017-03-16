/**
 * null
 */
package bcx17.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import bcx17.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostPushupDetectedRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostPushupDetectedRequestMarshaller {

    private static final MarshallingInfo<String> FULL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("full").build();

    private static final PostPushupDetectedRequestMarshaller instance = new PostPushupDetectedRequestMarshaller();

    public static PostPushupDetectedRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostPushupDetectedRequest postPushupDetectedRequest, ProtocolMarshaller protocolMarshaller) {

        if (postPushupDetectedRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postPushupDetectedRequest.getFull(), FULL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
