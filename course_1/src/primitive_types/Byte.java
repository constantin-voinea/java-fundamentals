package primitive_types;

/**
 * @author cvoinea
 *
 *  Java is statically-typed --> all variables must first be declared (type and name) before they can be used
 *  primitive data type vs. non-primitive/ reference data type
 *  variable's data type determines: values it may contain and operations that may be performed on it
 *  primitive data types: predefined by the language and named by a reserved keyword
 *  they directly hold a value in memory (number or character)
 *  they are not objects or references to objects
 *  primitive values don't share state with other primitive values
 *  the values stored in primitives are called literals (source code representation of a fixed value e.g. 232)
 *
 */
public class Byte {

    static byte defaultValue;

    public static void main(String[] args) {

        // byte --> 8-bit integer values
        byte b1 = -128;
        System.out.println(b1);
        byte b2 = 127;
        System.out.println(b2);
        b2++;
        System.out.println(b2++);
        System.out.println(++b2);

        System.out.println(defaultValue);
    }
}