package ir.pt.library.Service.lmpl;

import ir.pt.library.Repo.BookRepo;
import ir.pt.library.Service.BookService;
import ir.pt.library.entity.Book;
import ir.pt.library.entity.Category;
import ir.pt.library.model.BookDTO;
import ir.pt.library.model.CategoryDTO;
import ir.pt.library.model.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    List<BookDTO> books=new ArrayList<>();

    @Autowired
    private BookRepo bookRepo;
    @Override
    public BookDTO addBook(BookDTO book) {
        Book entityCategory= new Category( category.getName());
        categoryRepo.save(entityCategory);
        CategoryDTO categoryDTO = new CategoryDTO(entityCategory.getId(), entityCategory.getName());
        return categoryDTO;
    }

    @Override
    public BookDTO getBook(BookDTO book) {
        book.setName("tarikh");
        return book;
    }



    @Override
    public List<BookDTO> getListOfBook() {
        List<BookDTO> books=new ArrayList<>();
        BookDTO book= new BookDTO();
        for (int i=0;i<4 ;i++){
            book.setId(1);
            book.setName("tarikh");
            book.setCategory("history");
            book.setISBN(1234);
            book.setPrintDate(new Date(10/10/1989));

            books.add(book);

        }
        return books;
    }

    @Override
    public Boolean updateBook(BookDTO book) {

        book.setISBN(book.getISBN()+123);
        return true;
    }

    @Override
    public Boolean deleteBook(BookDTO book) {
        books.remove(book);

        return true;
    }
}
