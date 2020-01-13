package com.example.didemo.app;

import org.springframework.stereotype.Component;

@Component
public class Administrator implements Person {
    @Override
    public String getName() {
        return "Administrator here!";
    }
}
