package com.jeffbuonamici.Controller;

import com.jeffbuonamici.Entity.Book;
import com.jeffbuonamici.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
