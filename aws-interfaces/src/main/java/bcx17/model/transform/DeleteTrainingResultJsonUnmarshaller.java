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
 * DeleteTrainingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrainingResultJsonUnmarshaller implements Unmarshaller<DeleteTrainingResult, JsonUnmarshallerContext> {

    public DeleteTrainingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteTrainingResult deleteTrainingResult = new DeleteTrainingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteTrainingResult;
        }

        while (true) {
            if (token == null)
                break;

            deleteTrainingResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return deleteTrainingResult;
    }

    private static DeleteTrainingResultJsonUnmarshaller instance;

    public static DeleteTrainingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteTrainingResultJsonUnmarshaller();
        return instance;
    }
}
