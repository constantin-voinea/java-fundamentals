package optional;

import java.util.Optional;

/**
 * @author cvoinea
 */
public class Ex2 {

    public static void main(String[] args) {

        // orElse() vs. orElseGEt(): the supplier is never called if the wrapped value is present
        String initialValue = "123";
        Ex2 obj = new Ex2();
        System.out.println("using orElse()");
        String s1 = Optional.ofNullable(initialValue).orElse(obj.getDefault()); // this method is always called, it may produce side effects and a new object is created
        System.out.println(s1);
        System.out.println("using orElseGet()");
        String s2 = Optional.ofNullable(initialValue).orElseGet(obj::getDefault);
        System.out.println(s2);

        //orElseThrow()
        String s3 = null;
        String s4 = Optional.ofNullable(s3).orElseThrow(IllegalArgumentException::new); // constructor reference
//        String s5 = Optional.ofNullable(s3).orElseThrow(); // throws NoSuchElementException

    }

    String getDefault(){
        System.out.println("getting default value");
        return "default";
    }

}
