/**
 * null
 */
package bcx17;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import bcx17.model.*;
import bcx17.model.transform.*;

/**
 * Client for accessing KneeBends. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class KneeBendsClient implements KneeBends {

    private final ClientHandler clientHandler;

    private final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(bcx17.model.KneeBendsException.class));

    /**
     * Constructs a new client to invoke service methods on KneeBends using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    KneeBendsClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param deleteTrainingRequest
     * @return Result of the DeleteTraining operation returned by the service.
     * @sample KneeBends.DeleteTraining
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T11:24:08Z/DeleteTraining"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTrainingResult deleteTraining(DeleteTrainingRequest deleteTrainingRequest) {
        HttpResponseHandler<DeleteTrainingResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new DeleteTrainingResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<DeleteTrainingRequest, DeleteTrainingResult>()
                .withMarshaller(new DeleteTrainingRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(deleteTrainingRequest));
    }

    /**
     * @param getNumberOfPushupsCompletedRequest
     * @return Result of the GetNumberOfPushupsCompleted operation returned by the service.
     * @sample KneeBends.GetNumberOfPushupsCompleted
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T11:24:08Z/GetNumberOfPushupsCompleted"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNumberOfPushupsCompletedResult getNumberOfPushupsCompleted(GetNumberOfPushupsCompletedRequest getNumberOfPushupsCompletedRequest) {
        HttpResponseHandler<GetNumberOfPushupsCompletedResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNumberOfPushupsCompletedResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetNumberOfPushupsCompletedRequest, GetNumberOfPushupsCompletedResult>()
                .withMarshaller(new GetNumberOfPushupsCompletedRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getNumberOfPushupsCompletedRequest));
    }

    /**
     * @param postPushupDetectedRequest
     * @return Result of the PostPushupDetected operation returned by the service.
     * @sample KneeBends.PostPushupDetected
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T11:24:08Z/PostPushupDetected"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostPushupDetectedResult postPushupDetected(PostPushupDetectedRequest postPushupDetectedRequest) {
        HttpResponseHandler<PostPushupDetectedResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostPushupDetectedResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostPushupDetectedRequest, PostPushupDetectedResult>()
                .withMarshaller(new PostPushupDetectedRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postPushupDetectedRequest));
    }

    /**
     * @param postStartExercisingRequest
     * @return Result of the PostStartExercising operation returned by the service.
     * @sample KneeBends.PostStartExercising
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T11:24:08Z/PostStartExercising"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostStartExercisingResult postStartExercising(PostStartExercisingRequest postStartExercisingRequest) {
        HttpResponseHandler<PostStartExercisingResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostStartExercisingResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostStartExercisingRequest, PostStartExercisingResult>()
                .withMarshaller(new PostStartExercisingRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postStartExercisingRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
