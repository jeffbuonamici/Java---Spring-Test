package com.jeffbuonamici.DAO;

import com.jeffbuonamici.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookDAO {

    private static Map<Integer, Book> books;

    static {
        books = new HashMap<Integer, Book>() {
            {
                put(1, new Book(1, "Book Title 1"));
                put(2, new Book(2, "Book Title 2"));
                put(3, new Book(2, "Book Title 3"));
            }
        };
    }

    public Collection<Book> getAllBooks() {
        return this.books.values();
    }
}
