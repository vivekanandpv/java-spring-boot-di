package com.example.didemo.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Invoice {


    @Autowired
    @Qualifier("customerInstance")
    private Customer customer;  //  this is not customerInstance!

    @Autowired(required = false)    //  component not configured. hence will not be provided.
    private Address address;

    public String getName() {
        boolean status = this.address == null;
        return "Invoice for " + customer.getName() + " address is null: " + status ;
    }
}
