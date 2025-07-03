package com.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.library.service.BookService;

@Configuration
public class AppConfig {

    @Bean
    public BookService bookService() {
        return new BookService();
    }
}
