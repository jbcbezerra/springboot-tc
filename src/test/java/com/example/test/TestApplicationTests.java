package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

// passes as long "DEV-DB" is running (as specified in
// application.yaml/startDevDeb.sh)
@SpringBootTest(properties = "spring.jpa.hibernate.ddl-auto=none") // this better!(?)
@AutoConfigureTestDatabase(replace = Replace.NONE)
class TestApplicationTests {

    @Test
    void contextLoads(@Autowired DataSource ds) {
        assertNotNull(ds);
    }

}
