package optional;

import java.util.Optional;

/**
 * @author cvoinea
 */
public class Ex3 {

    public static void main(String[] args) {

        // retrieve the value in Optional
        Optional<String> optional = Optional.of("java");
        String s1 = optional.get(); // throws NoSuchElement exception if the wrapped object is null
        System.out.println(s1); // java

        // ifPresent() - executes only when the wrapped value is not empty
        Optional<Integer> optionalInteger = Optional.of(1);
        optionalInteger.ifPresent(System.out::println); // 1
        Optional<Integer> emptyInteger = Optional.empty();
        emptyInteger.ifPresent(System.out::println);


    }
}
