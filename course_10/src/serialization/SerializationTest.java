package serialization;

import java.io.*;
import java.time.LocalDateTime;

/**
 * @author cvoinea
 *
 * NotSerializableException is thrown if the object being serialized/deserialized contains references to other objects not declared Serializable
 *
 *  many Java projects serialize Java objects using different mechanisms than the Java serialization mechanism
 *  e.g., Java objects are serialized into JSON, BSON or other more optimized binary formats
 *  advantage - the objects are also readable by non-Java applications (JavaScript running in a web browser can natively serialize and deserialize objects to and from JSON)
 *
 *  JSON APIs: Jackson, GSON, JSON.org, JSONP
 */
public class SerializationTest {

    private static final String FILE_NAME = "s1";

    public static void main(String[] args) {

        Address address = new Address("Maniu", 33);
        Student student = new Student("student 1", 20, 232, new int[]{8, 8, 9, 10}, address);
        System.out.println(student);
        serializeStudent(student);
        Student.setFaculty("abc");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        student.setCurrentTime(now);
        student = deserializeStudent();
        System.out.println(student);

    }

    static void serializeStudent(Student student) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Student deserializeStudent() {
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
