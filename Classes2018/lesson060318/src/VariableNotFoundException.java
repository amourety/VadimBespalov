/**
 * Created by amour on 11.04.2018.
 */
public class VariableNotFoundException extends RuntimeException {
    public VariableNotFoundException() {
        super();
    }

    public VariableNotFoundException(String message) {
        super(message);
    }

    public VariableNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public VariableNotFoundException(Throwable cause) {
        super(cause);
    }

    public VariableNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
