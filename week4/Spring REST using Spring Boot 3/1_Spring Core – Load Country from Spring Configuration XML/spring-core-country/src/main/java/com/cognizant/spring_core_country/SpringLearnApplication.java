package com.cognizant.spring_core_country;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("STARTING MAIN METHOD");
        displayCountryList();  

        LOGGER.debug("ENDING MAIN METHOD");
    }

    public static void displayCountryList() {
        LOGGER.debug("STARTING displayCountryList");
        // Implementation goes here, for example:
        // Load countries from Spring context and print them
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            List<?> countryList = context.getBean("countryList", List.class);
            LOGGER.debug("Country List: {}", countryList);
        }
        LOGGER.debug("ENDING displayCountryList");
    }
}

