package com.jeffbuonamici.Service;

import com.jeffbuonamici.DAO.BookDAO;
import com.jeffbuonamici.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getAllBooks() {
        return this.bookDAO.getAllBooks();
    }
}
