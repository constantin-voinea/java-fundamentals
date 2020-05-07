package serialization;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author cvoinea
 * java.io.Serializable --> marker interface that classes must implement if they are to be serialized and deserialized
 * serialVersionUID variable is used by Java's object serialization API
 * to determine if a deserialized object was serialized (written)
 * with the same version of the class, as it is now attempting to deserialize it into
 */
public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private static String faculty = "FMI";
    private int studyGroup;
    private int[] marks;
    private LocalDateTime currentTime;
    private Address address;

    public Student(String name, int age, int studyGroup, int[] marks, Address address) {
        super(name, age);
        this.studyGroup = studyGroup;
        this.marks = marks;
        currentTime = LocalDateTime.now();
        this.address = address;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static void setFaculty(String faculty) {
        Student.faculty = faculty;
    }

    public int getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(int studyGroup) {
        this.studyGroup = studyGroup;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        this.currentTime = currentTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "faculty=" + faculty +
                ", studyGroup=" + studyGroup +
                ", marks=" + Arrays.toString(marks) +
                ", currentTime=" + currentTime +
                '}' + ", Address: " + address;
    }
}
