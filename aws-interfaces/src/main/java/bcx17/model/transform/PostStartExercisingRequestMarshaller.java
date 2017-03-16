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
 * PostStartExercisingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostStartExercisingRequestMarshaller {

    private static final PostStartExercisingRequestMarshaller instance = new PostStartExercisingRequestMarshaller();

    public static PostStartExercisingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostStartExercisingRequest postStartExercisingRequest, ProtocolMarshaller protocolMarshaller) {

        if (postStartExercisingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
