/**
 * null
 */
package bcx17.model;

import com.amazonaws.opensdk.SdkErrorHttpMetadata;
import com.amazonaws.opensdk.internal.BaseException;
import com.amazonaws.annotation.SdkInternalApi;
import javax.annotation.Generated;

/**
 * Base exception for all service exceptions thrown by LambdaMicroservice
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KneeBendsException extends com.amazonaws.SdkBaseException implements BaseException {

    private static final long serialVersionUID = 1L;

    private SdkErrorHttpMetadata sdkHttpMetadata;

    private String message;

    /**
     * Constructs a new KneeBendsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KneeBendsException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public KneeBendsException sdkHttpMetadata(SdkErrorHttpMetadata sdkHttpMetadata) {
        this.sdkHttpMetadata = sdkHttpMetadata;
        return this;
    }

    @Override
    public SdkErrorHttpMetadata sdkHttpMetadata() {
        return sdkHttpMetadata;
    }

    @SdkInternalApi
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
