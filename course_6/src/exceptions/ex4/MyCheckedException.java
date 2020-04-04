package exceptions.ex4;

/**
 * @author cvoinea
 *
 * custom checked exception
 */
public class MyCheckedException extends Exception {

    public MyCheckedException(String s) {
        super(s);
    }
}
