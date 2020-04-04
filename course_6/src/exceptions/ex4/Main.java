package exceptions.ex4;

/**
 * @author cvoinea
 */
public class Main {

    private static final int AMOUNT = 100;

    public static void main(String[] args) {
        try {
            int x = m1(101);
            System.out.println(++x);
        } catch (MyCheckedException e) {
            System.out.println(e);
            m2();
        }
    }

    static int m1(int x) throws MyCheckedException {
        if (x <= AMOUNT) {
            return x;
        } else {
            throw new MyCheckedException("not a valid input");
        }
    }

    static void m2() {
        throw new MyRuntimeException("my rt exception in m2");
    }
}
