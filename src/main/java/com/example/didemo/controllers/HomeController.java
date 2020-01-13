package com.example.didemo.controllers;

import com.example.didemo.app.Car;
import com.example.didemo.app.Invoice;
import com.example.didemo.app.Person;
import com.example.didemo.app.Vehicle;
import com.example.didemo.config.AppConfig;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class HomeController {
    @Autowired
    private Invoice invoice;

    @Autowired
    private Person person;

    @GetMapping("/")
    public String getVehicle() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle vehicle = context.getBean(Car.class);
        return vehicle.drive();
    }

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public String getInvoice() {
        return this.invoice.getName();
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String getPerson() {
        return this.person.getName();
    }

    @RequestMapping(value = "/items/{id}", method = RequestMethod.DELETE)
    public String getFoo(@PathVariable int id) {
        return "You sent " + id;
    }

    @RequestMapping(value = "/items/{id}", method = RequestMethod.POST)
    public String create(@PathVariable Long id, @RequestBody String input) {
        return "You sent POST with " + id + " " + input;
    }
}
