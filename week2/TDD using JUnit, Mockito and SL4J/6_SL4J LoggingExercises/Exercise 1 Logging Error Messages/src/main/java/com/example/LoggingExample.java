package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        System.out.println("Application started...");

        logger.error("ERROR: Something went wrong during execution!");
        logger.warn("WARNING: This action may cause unexpected behavior.");

        System.out.println("Application finished.");
    }
}
