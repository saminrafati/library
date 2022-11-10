package ir.pt.library.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema="asadi")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person")
    @SequenceGenerator(name = "seq_person", initialValue = 1, allocationSize = 1)
    private int id;
    private String name;
    private  String family;
    private int code;


//    @OneToMany(mappedBy = "person") //each person many books
//    private List<Book> bookList2;

    public Person() {
    }

    public Person(String name, String family, int code) {
        this.name = name;
        this.family = family;
        this.code = code;
    }

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //    public List<Book> getBookList2() {
//        return bookList2;
//    }
//
//    public void setBookList2(List<Book> bookList2) {
//        this.bookList2 = bookList2;
//    }
}
