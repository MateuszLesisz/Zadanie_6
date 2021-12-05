package com.infoshareacademy.repository;

import com.infoshareacademy.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class BookCase {

    @GetMapping("books")
    public List<Book> allBooksView() {
        Books books = new Books();
        return books.getBooks();
    }
}
