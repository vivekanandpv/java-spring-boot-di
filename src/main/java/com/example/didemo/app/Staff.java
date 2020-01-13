package com.example.didemo.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Staff implements Person {
    @Override
    public String getName() {
        return "Staff here!";
    }
}
