package com.library.service;

import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void listBooks() {
        System.out.println("Listing books:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
