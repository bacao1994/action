package com.study.git.action.facade;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class GreetingFacade {
    public String greeting() {
        return "Hello World, fail";
    }

    public String greetingWithName(String name) {
        return "Hello " + name;
    }
}
