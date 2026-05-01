package com.example.injectiondepandcy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class InjectionDepandcyApplication {

    private static final Logger logger = LoggerFactory.getLogger(InjectionDepandcyApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(InjectionDepandcyApplication.class, args);

        try {
            DataSource dataSource = context.getBean(DataSource.class);
            try (var connection = dataSource.getConnection()) {
                logger.info("Database connected");
            }
        } catch (Exception exception) {
            logger.error("Database not connected: {}", exception.getMessage());
        }
    }

}
