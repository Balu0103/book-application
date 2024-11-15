package com.balu.BookApplication.Repository;

import com.balu.BookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book findBookByName(String name);
}
