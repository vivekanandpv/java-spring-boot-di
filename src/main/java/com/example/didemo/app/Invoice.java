package com.example.didemo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Invoice {


    @Autowired
    private Customer customerInstance;

    public String getName() {
        return "Invoice for " + customerInstance.getName();
    }
}
