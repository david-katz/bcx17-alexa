/**
 * null
 */
package bcx17;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link bcx17.KneeBends}. Use of the builder is preferred over using constructors of the client
 * class.
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class KneeBendsClientBuilder extends SdkSyncClientBuilder<KneeBendsClientBuilder, KneeBends> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("efvp0jra7k.execute-api.eu-central-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-central-1";

    /**
     * Package private constructor - builder should be created via {@link KneeBends#builder()}
     */
    KneeBendsClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey
     *        API Key that identifies caller.
     * @return This object for method chaining.
     */
    @Override
    public void setApiKey(String apiKey) {
        super.setApiKey(apiKey);
    }

    /**
     * Specify the API Key to send with requests.
     *
     * @param apiKey
     *        API Key that identifies caller.
     * @return This object for method chaining.
     */
    public KneeBendsClientBuilder apiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * Construct a synchronous implementation of KneeBends using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of KneeBends.
     */
    @Override
    protected KneeBends build(AwsSyncClientParams params) {
        return new KneeBendsClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
