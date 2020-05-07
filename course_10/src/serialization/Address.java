package serialization;

import java.io.Serializable;

/**
 * @author cvoinea
 */
public class Address implements Serializable {

    private String streetNo;
    private int no;

    public Address(String streetNo, int no) {
        this.streetNo = streetNo;
        this.no = no;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNo='" + streetNo + '\'' +
                ", no=" + no +
                '}';
    }
}
