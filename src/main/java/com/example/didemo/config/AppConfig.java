package com.example.didemo.config;

import com.example.didemo.app.Car;
import com.example.didemo.app.Owner;
import com.example.didemo.app.Registration;
import com.example.didemo.app.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Vehicle getVehicle() {

        return new Car(new Registration());
    }

    @Bean
    public Owner getOwner1() {
        return  new Owner("owner 1");
    }

    @Bean
    public Owner getOwner2() {
        return  new Owner("owner 2");
    }

    @Bean
    public Registration getRegistration() {
        return new Registration();
    }

}
