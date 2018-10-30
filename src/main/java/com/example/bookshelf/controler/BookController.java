package com.example.bookshelf.controler;

import com.example.bookshelf.domain.AuthorEntity;
import com.example.bookshelf.domain.BookEntity;
import com.example.bookshelf.repos.AuthorRepo;
import com.example.bookshelf.repos.BookRepo;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {



    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/books")
    public String books(Map<String, Object> model) {
        Iterable<BookEntity> books = bookRepo.findAll();

        model.put("books", books);
        return "books";
    }

    @PostMapping("/books")
    public String add(@RequestParam Integer book_id,@RequestParam String name, @RequestParam Date published,
                      @RequestParam String genre, @RequestParam Integer rating,
                      Map<String, Object> model) {
        BookEntity book = new BookEntity(book_id,name, published, genre, rating);

        bookRepo.save(book);

        Iterable<BookEntity> books = bookRepo.findAll();

        model.put("books", books);
        return "books";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<BookEntity> books;
        if (filter != null && !filter.isEmpty()) {
            books = bookRepo.findBookByName(filter);
        } else {
            books = bookRepo.findAll();
        }
        model.put("books", books);
        return "books";
    }


}