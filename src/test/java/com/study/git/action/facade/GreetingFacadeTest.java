package com.study.git.action.facade;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetingFacadeTest {

    @Autowired
    private GreetingFacade greetingFacade;

    @Test
    public void testGreeting() {
        String greeting = greetingFacade.greeting();
        assertEquals("Hello World", greeting);
    }

    @Test
    public void testGreetingWithName() {
        String greeting = greetingFacade.greetingWithName("John");
        assertEquals("Hello John", greeting);
    }
}
