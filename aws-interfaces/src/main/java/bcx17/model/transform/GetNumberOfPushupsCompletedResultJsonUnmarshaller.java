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
 * GetNumberOfPushupsCompletedResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNumberOfPushupsCompletedResultJsonUnmarshaller implements Unmarshaller<GetNumberOfPushupsCompletedResult, JsonUnmarshallerContext> {

    public GetNumberOfPushupsCompletedResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetNumberOfPushupsCompletedResult getNumberOfPushupsCompletedResult = new GetNumberOfPushupsCompletedResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getNumberOfPushupsCompletedResult;
        }

        while (true) {
            if (token == null)
                break;

            getNumberOfPushupsCompletedResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getNumberOfPushupsCompletedResult;
    }

    private static GetNumberOfPushupsCompletedResultJsonUnmarshaller instance;

    public static GetNumberOfPushupsCompletedResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetNumberOfPushupsCompletedResultJsonUnmarshaller();
        return instance;
    }
}
