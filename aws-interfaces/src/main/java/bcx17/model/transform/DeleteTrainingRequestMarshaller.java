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
 * DeleteTrainingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteTrainingRequestMarshaller {

    private static final DeleteTrainingRequestMarshaller instance = new DeleteTrainingRequestMarshaller();

    public static DeleteTrainingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteTrainingRequest deleteTrainingRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteTrainingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
