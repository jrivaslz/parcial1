package me.aboullaite.bookstore.controller;

import me.aboullaite.bookstore.model.Book;
import me.aboullaite.bookstore.model.Demobook;
import me.aboullaite.bookstore.repository.DemobookRepository;
import me.aboullaite.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    DemobookRepository repositorio;

    @GetMapping("")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookService.getBooks());
    }

    @GetMapping("/demo")
    public ResponseEntity<List<Demobook>> getAllDemoBooks(){
        return ResponseEntity.ok((List<Demobook>)repositorio.findAll());
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Book>> getBookByIsbn(){
        List<Book> optBook = bookService.getBooksFilter();
        return ResponseEntity.ok(optBook);
    }
    @GetMapping("/danger")
    public ResponseEntity<List<Book>> unstableBooksEndpoint(){
        return ResponseEntity.ok(bookService.longExecutionMethod());
    }
}
