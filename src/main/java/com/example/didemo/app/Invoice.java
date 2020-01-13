package com.example.didemo.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Invoice {


    @Autowired
    private Customer customerInstance;

    @Autowired(required = false)    //  component not configured. hence will not be provided.
    private Address address;

    public String getName() {
        boolean status = this.address == null;
        return "Invoice for " + customerInstance.getName() + " address is null: " + status ;
    }
}
