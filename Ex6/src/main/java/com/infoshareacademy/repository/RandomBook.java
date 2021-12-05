package com.infoshareacademy.repository;

import com.infoshareacademy.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Random;

@RestController
public class RandomBook {

    @GetMapping("book-for-today")
    public Book printRandomBook() {
        Books books = new Books();
        Collections.shuffle(books.getBooks(), new Random());
        return books.getBooks().get(0);
    }
}
