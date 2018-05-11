package sk.akademiasovy.library.entity;
import javax.persistence.*;


@Entity
@Table(name="book")
public class Book{
    @Id
    @Column(name="book")
    private long ID;
    @Column(name="Name")
    private String Name;
    @Column(name="Year")
    private int Year;
    private Writer writer;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
