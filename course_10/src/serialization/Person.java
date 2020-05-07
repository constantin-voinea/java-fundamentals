package serialization;

import java.io.Serializable;

/**
 * @author cvoinea
 *
 * if parrent class of a serialized subclass object is not serializable, inherited members are not serialized
 * in the previous scenario, to deserialize an object of a subclass, the superclass must have a no-args constructor available
 */
public class Person implements Serializable {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
