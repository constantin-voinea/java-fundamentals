package exceptions.ex4;

/**
 * @author cvoinea
 *
 * custom unchecked exception
 */
public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(String message) {
        super(message);
    }
}
