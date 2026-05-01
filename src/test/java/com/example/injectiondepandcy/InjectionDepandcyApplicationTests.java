package com.example.injectiondepandcy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class InjectionDepandcyApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
    }

    @Test
    void databaseConnectionWorks() throws Exception {
        assertNotNull(dataSource);

        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement();
             var resultSet = statement.executeQuery("select 1")) {
            resultSet.next();
            assertEquals(1, resultSet.getInt(1));
        }
    }

}
