package com.balu.BookApplication.Controller;

import com.balu.BookApplication.Entity.Book;
import com.balu.BookApplication.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book/v1")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        Book saveBook = bookService.addBook(book);
        return ResponseEntity.ok(saveBook);
    }

    @GetMapping("/Books")
    public ResponseEntity<List<Book>> getAllBook() {
        return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
    }

    @GetMapping("/getBook/{bookName}")
    public ResponseEntity<Book> getBookByName(@PathVariable("bookName") String name) {
        final Book bookByName = bookService.getBookByName(name);
        return ResponseEntity.ok(bookByName);
    }
    
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        Book bookById = bookService.getBookById(id);
        if(bookById!=null) {
            return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Book updatedBook = bookService.updateBook(book);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
