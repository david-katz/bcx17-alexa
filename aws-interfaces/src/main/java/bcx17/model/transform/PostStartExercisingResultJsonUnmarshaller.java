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
 * PostStartExercisingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostStartExercisingResultJsonUnmarshaller implements Unmarshaller<PostStartExercisingResult, JsonUnmarshallerContext> {

    public PostStartExercisingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostStartExercisingResult postStartExercisingResult = new PostStartExercisingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return postStartExercisingResult;
        }

        while (true) {
            if (token == null)
                break;

            postStartExercisingResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return postStartExercisingResult;
    }

    private static PostStartExercisingResultJsonUnmarshaller instance;

    public static PostStartExercisingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostStartExercisingResultJsonUnmarshaller();
        return instance;
    }
}
