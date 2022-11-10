package ir.pt.library.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema="asadi")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_book")
    @SequenceGenerator(name = "seq_book", initialValue = 1, allocationSize = 1)
    private int id;
    private  String name;

    private  int ISBN;
    private Date printDate;



    @ManyToOne
    private Category category;

    public Book() {
    }

    public Book(String name, int ISBN, Date printDate, Category category) {
        this.name = name;
        this.ISBN = ISBN;
        this.printDate = printDate;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Date getPrintDate() {
        return printDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }
}

