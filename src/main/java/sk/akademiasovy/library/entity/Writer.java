package sk.akademiasovy.library.entity;
import javax.persistence.*;

@Entity
@Table(name="writer")
public class Writer {
    @Id
    @Column(name="ID")
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private long ID;
    @Column(name="FirstName")
    private String FirstName;
    @Column(name="LastName")
    private String LastName;
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstname) {
        this.FirstName = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastname) {
        this.LastName = lastname;
    }
}
