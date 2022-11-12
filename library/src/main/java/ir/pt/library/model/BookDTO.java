package ir.pt.library.model;

import javax.xml.crypto.Data;
import java.util.Date;


public class BookDTO {
    private int id;
    private  String name;
    private CategoryDTO category;
    private  int ISBN;
    private Date printDate;

    public BookDTO() {
    }

    public BookDTO(String name, CategoryDTO category, int ISBN, Date printDate) {
        this.name = name;
        this.category = category;
        this.ISBN = ISBN;
        this.printDate = printDate;
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

    public CategoryDTO getCategory() {

        return category;
    }

    public void setCategory(CategoryDTO category) {
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
