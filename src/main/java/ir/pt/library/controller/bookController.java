package ir.pt.library.controller;

import ir.pt.library.Service.BookService;
import ir.pt.library.model.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class bookController {
    @Autowired
    BookService bookService;

    List<BookDTO> books=new ArrayList<>();
    @PostMapping(value = "/add")
    public ResponseEntity addBook(BookDTO book) {

        return ResponseEntity.ok(bookService.addBook(book));




    }

    @GetMapping(value = "/search")
    public ResponseEntity getBook(@RequestBody BookDTO book) throws Exception{
        return ResponseEntity.ok(bookService.getBook(book));

    }

    @GetMapping(value = "/select")
    public  ResponseEntity  getListOfBook(@RequestBody BookDTO book) throws Exception{


        return ResponseEntity.ok(bookService.getListOfBook());


    }

    @PutMapping(value = "/update")
    public ResponseEntity updateBook(@RequestBody BookDTO book) throws Exception{
        return ResponseEntity.ok(bookService.updateBook(book));

    }

    @DeleteMapping(value = "/delete")

    public ResponseEntity deleteBook(@RequestBody BookDTO book) throws Exception{

        return ResponseEntity.ok(bookService.deleteBook(book));

    }

}
