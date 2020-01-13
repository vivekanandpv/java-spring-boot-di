package com.example.didemo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


public class Car implements Vehicle {
    @Autowired
    @Qualifier("getOwner1")
    private Owner owner;

    private Registration registration;

    @Autowired
    public Car(Registration registration) {
        this.registration = registration;
    }

    @Override
    public String drive() {
        return "Car is driven by " + owner.getName() + " Registration number: " + registration.getNumber();
    }


}
