/**
 * null
 */
package bcx17;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import bcx17.model.*;

/**
 * Interface for accessing KneeBends.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface KneeBends {

    /**
     * @param postPushupDetectedRequest
     * @return Result of the PostPushupDetected operation returned by the service.
     * @sample KneeBends.PostPushupDetected
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T08:57:52Z/PostPushupDetected"
     *      target="_top">AWS API Documentation</a>
     */
    PostPushupDetectedResult postPushupDetected(PostPushupDetectedRequest postPushupDetectedRequest);

    /**
     * @param postStartExercisingRequest
     * @return Result of the PostStartExercising operation returned by the service.
     * @sample KneeBends.PostStartExercising
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T08:57:52Z/PostStartExercising"
     *      target="_top">AWS API Documentation</a>
     */
    PostStartExercisingResult postStartExercising(PostStartExercisingRequest postStartExercisingRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static KneeBendsClientBuilder builder() {
        return new KneeBendsClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
