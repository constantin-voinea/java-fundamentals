package optional;

import java.util.Optional;

/**
 * @author cvoinea
 * <p>
 * Optional class introduced in Java 8
 * purpose of use: provide a type-level solution for representing optional values instead of null references
 * Optional is meant to be used as a return type
 * trying to use Optional as a field type is not recommended; in a serializable class it will result in a NotSerializableException
 */
public class Ex1 {

    public static void main(String[] args) {

        //creating Optional objects
        // empty()
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); // false

        // of()
        Optional<String> o1 = Optional.of("abcabc");
        System.out.println(o1.isPresent()); //true
//        System.out.println(o1.isEmpty()); // starting with Java 11, opposite of isPresent()
        System.out.println(o1); //Optional[abcabc]
        // throws NPE if null is provided as argument
//        System.out.println(Optional.of(null));

        // ofNullable()
        String s1 = null;
        Optional<String> nullSafe = Optional.ofNullable(s1); // will create Optional.empty
        System.out.println(nullSafe);

        // ofNullable().orElse()
        String s2 = Optional.ofNullable(s1).orElse(""); // returns default value provided in orElse() if first value is null

        // ofNullable().orElseGet() -- similar with orElse(), but takes a Supplier as param
        String s3 = Optional.ofNullable(s1).orElseGet(() -> "");
        String s4 = Optional.ofNullable(s1).orElse("default");

    }
}
