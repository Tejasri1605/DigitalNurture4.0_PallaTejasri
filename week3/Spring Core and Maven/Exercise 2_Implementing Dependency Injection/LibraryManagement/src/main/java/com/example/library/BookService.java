package com.example.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printAllBooks() {
        List<Book> books = bookRepository.getAllBooks();
        for (Book book : books) {
            System.out.println("Book ID: " + book.getId() + ", Title: " + book.getTitle());
        }
    }
}
