package ir.pt.library.Service.lmpl;

import ir.pt.library.Repo.BookRepo;
import ir.pt.library.Service.BookService;
import ir.pt.library.entity.Book;
import ir.pt.library.entity.Category;
import ir.pt.library.model.BookDTO;
import ir.pt.library.model.CategoryDTO;
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
        Category category=new Category(book.getCategory().getId(),book.getCategory().getName());
       Book entityBook=new Book(book.getName(),book.getISBN(),book.getPrintDate(),category);
       bookRepo.save(entityBook);
        CategoryDTO categoryDTO=new CategoryDTO(entityBook.getCategory().getId(),entityBook.getCategory().getName());
       BookDTO bookDTO=new BookDTO(entityBook.getName(), categoryDTO ,entityBook.getISBN(),entityBook.getPrintDate());

        return bookDTO;



    }

    @Override
    public BookDTO getBook(BookDTO book) {
        Book entityBook=bookRepo.findById(book.getId()).get();
        CategoryDTO categoryDTO=new CategoryDTO(entityBook.getCategory().getId(),entityBook.getCategory().getName());
        return new BookDTO(entityBook.getName(), categoryDTO,entityBook.getISBN(),entityBook.getPrintDate());
    }



    @Override
    public List<BookDTO> getListOfBook() {
       List<Book> entityBooks=(List) bookRepo.findAll();
       List<BookDTO> booksDTO=new ArrayList<>();
       for(Book entityBook:entityBooks){
           CategoryDTO categoryDTO=new CategoryDTO(entityBook.getCategory().getId(),entityBook.getCategory().getName());
           booksDTO.add(new BookDTO(entityBook.getName(),categoryDTO,entityBook.getISBN(),entityBook.getPrintDate()));
       }
       return booksDTO;

    }

    @Override
    public Boolean updateBook(BookDTO book) {

        book.setISBN(book.getISBN()+123);
        return true;
    }

    @Override
    public Boolean deleteBook(BookDTO book) {
        bookRepo.deleteById(book.getId());

        return true;
    }
}
