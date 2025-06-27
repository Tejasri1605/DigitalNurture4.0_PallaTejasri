package com.example;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private Set<String> books = new HashSet<>();

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public boolean isBookAvailable(String bookTitle) {
        return books.contains(bookTitle);
    }

    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }

    public void clearLibrary() {
        books.clear();
    }
}
