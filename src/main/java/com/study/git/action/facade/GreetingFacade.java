package com.study.git.action.facade;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class GreetingFacade {
    public String greeting() {
        return "Hello World, should be fail test case here";
    }

    public String greetingWithName(String name) {
        return "Hello " + name;
    }
}
