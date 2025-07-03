package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.config.AppConfig;
import com.library.model.Book;
import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BookService service = context.getBean(BookService.class);

        Book book1 = new Book("The Spring Journey", "John Doe");
        Book book2 = new Book("Java for Beginners", "Jane Smith");

        service.addBook(book1);
        service.addBook(book2);

        service.listBooks();
    }
}
