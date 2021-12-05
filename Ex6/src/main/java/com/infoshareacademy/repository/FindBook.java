package com.infoshareacademy.repository;

import com.infoshareacademy.domain.Book;
import com.infoshareacademy.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FindBook {

    @GetMapping("/book/{title}/search")
    public List<Book> findTitleFromString(@PathVariable String title) {
        Books books = new Books();
        Book book = new Book();

        List<Book> newBookList = new ArrayList<>();
        for(Book i : books.getBooks()) {
            if(book.getTitle().contains(title)) {
                newBookList.add(i);
            }
        }
        return newBookList;
    }


}
