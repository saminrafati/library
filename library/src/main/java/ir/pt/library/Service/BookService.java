package ir.pt.library.Service;


import ir.pt.library.model.BookDTO;

import java.util.List;


public interface BookService {
    BookDTO addBook(BookDTO book);
    BookDTO getBook(BookDTO book);
    List<BookDTO> getListOfBook();
    Boolean updateBook(BookDTO book);
    Boolean deleteBook(BookDTO book);
}
