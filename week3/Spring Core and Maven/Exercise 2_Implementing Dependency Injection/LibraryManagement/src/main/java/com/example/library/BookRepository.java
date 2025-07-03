package com.example.library;

import java.util.List;
import java.util.Arrays;

public class BookRepository {
    public List<Book> getAllBooks() {
        return Arrays.asList(
            new Book(1, "A King's Oath"),
            new Book(2, "Can we be strangers again?")
        );
    }
}
