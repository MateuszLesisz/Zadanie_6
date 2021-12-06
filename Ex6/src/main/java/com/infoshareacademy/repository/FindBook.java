package com.infoshareacademy.repository;

import com.infoshareacademy.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FindBook {

    @GetMapping("/book/{title}/search")
    @ResponseBody
    public List<String> findTitleFromString(@PathVariable String title) {
        Books books = new Books();
        List<String> newBookList = new ArrayList<>();
        for (Book book : books.getBooks()) {
            for (String stringInTitle : books.booksTitle()) {
                if(books.getBooks().contains("Hobbit")) {
                    newBookList.add(stringInTitle);
                }
            }
        }
        return newBookList;
    }
}
