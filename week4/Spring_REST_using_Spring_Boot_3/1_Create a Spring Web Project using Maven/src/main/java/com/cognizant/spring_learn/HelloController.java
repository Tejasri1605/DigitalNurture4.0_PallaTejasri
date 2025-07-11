package com.cognizant.spring_learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/") 
    public String welcome() {
        return "Welcome, Spring Boot application is running successfully!";
    }

    @GetMapping("/hello")  
    public String hello() {
        return "Hello from Spring Boot!";
    }
}

