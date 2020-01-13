package com.example.didemo.config;

import com.example.didemo.app.Car;
import com.example.didemo.app.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean()
    public Vehicle getVehicle() {
        return new Car();
    }

}
