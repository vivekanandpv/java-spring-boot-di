package com.example.didemo.controllers;

import com.example.didemo.app.Vehicle;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class HomeController {
    @Autowired
    private Vehicle vehicle;

    @GetMapping("/")
    public String getVehicle() {
        return this.vehicle.drive();
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
