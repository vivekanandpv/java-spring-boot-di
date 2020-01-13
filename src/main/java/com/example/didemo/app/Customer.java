package com.example.didemo.app;

import org.springframework.stereotype.Component;

//@Component("customerInstance")  //  wired only for the property with customerInstance
@Component  //  goes by type
public class Customer {
    public String getName() {
        return "Default Customer";
    }
}
