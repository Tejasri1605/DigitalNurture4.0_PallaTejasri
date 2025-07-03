package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        // Load Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService bookService = context.getBean("bookService", BookService.class);

        // Use the service
        bookService.addBook("The Great Indian Novel");
    }
}
