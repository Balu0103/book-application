package com.balu.BookApplication.Service;

import com.balu.BookApplication.Entity.Book;
import com.balu.BookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book) {
        return bookRepository.save(book);

    }

    public Book getBookByName(String name) {
         return bookRepository.findBookByName(name);

    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }
}
