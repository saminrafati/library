package ir.pt.library.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "raefati")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_category")
    @SequenceGenerator(name = "seq_category", initialValue = 1, allocationSize = 1)
    private int id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Book> bookList;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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


    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
