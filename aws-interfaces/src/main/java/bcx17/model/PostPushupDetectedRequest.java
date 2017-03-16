/**
 * null
 */
package bcx17.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/efvp0jra7k-2017-03-16T11:24:08Z/PostPushupDetected"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostPushupDetectedRequest extends com.amazonaws.opensdk.BaseRequest implements Serializable, Cloneable {

    private String full;

    /**
     * @param full
     */

    public void setFull(String full) {
        this.full = full;
    }

    /**
     * @return
     */

    public String getFull() {
        return this.full;
    }

    /**
     * @param full
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostPushupDetectedRequest full(String full) {
        setFull(full);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFull() != null)
            sb.append("Full: ").append(getFull());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostPushupDetectedRequest == false)
            return false;
        PostPushupDetectedRequest other = (PostPushupDetectedRequest) obj;
        if (other.getFull() == null ^ this.getFull() == null)
            return false;
        if (other.getFull() != null && other.getFull().equals(this.getFull()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFull() == null) ? 0 : getFull().hashCode());
        return hashCode;
    }

    @Override
    public PostPushupDetectedRequest clone() {
        return (PostPushupDetectedRequest) super.clone();
    }

    /**
     * Set the configuration for this request.
     *
     * @param sdkRequestConfig
     *        Request configuration.
     * @return This object for method chaining.
     */
    public PostPushupDetectedRequest sdkRequestConfig(com.amazonaws.opensdk.SdkRequestConfig sdkRequestConfig) {
        super.sdkRequestConfig(sdkRequestConfig);
        return this;
    }

}
