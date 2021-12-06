package com.infoshareacademy.repository;

import com.infoshareacademy.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FindBook {

    @GetMapping("/book/{title}/search")
    @ResponseBody
    public List<Book> findTitleFromString(@PathVariable String title) {
        Books books = new Books();
        List<Book> newBookList = new ArrayList<>();
        for (Book book : books.getBooks()) {
                if(book.getTitle().contains(title.toLowerCase())) {
                    newBookList.add(book);
                }
            }
        return newBookList;
        }

    }
