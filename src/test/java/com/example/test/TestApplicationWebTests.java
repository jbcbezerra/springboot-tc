package com.example.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class TestApplicationWebTests {
    @Autowired
    MockMvc mvc;

    @Test
    void test404() throws Exception {
        mvc.perform(get("/")).andExpect(status().isNotFound());
    }
}
