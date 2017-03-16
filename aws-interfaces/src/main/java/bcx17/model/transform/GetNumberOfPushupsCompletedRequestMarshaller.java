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
 * GetNumberOfPushupsCompletedRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetNumberOfPushupsCompletedRequestMarshaller {

    private static final GetNumberOfPushupsCompletedRequestMarshaller instance = new GetNumberOfPushupsCompletedRequestMarshaller();

    public static GetNumberOfPushupsCompletedRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetNumberOfPushupsCompletedRequest getNumberOfPushupsCompletedRequest, ProtocolMarshaller protocolMarshaller) {

        if (getNumberOfPushupsCompletedRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
