package me.bezgerts.pechkin.controller;

import me.bezgerts.pechkin.domain.Book;
import me.bezgerts.pechkin.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        List<Book> books = bookService.getAll();
        return books;
    }
}
