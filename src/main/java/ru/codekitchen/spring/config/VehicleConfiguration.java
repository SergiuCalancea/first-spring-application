package ru.codekitchen.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.codekitchen.spring.Car;
import ru.codekitchen.spring.Motorbike;

@Configuration
public class VehicleConfiguration {

    @Bean
    public Motorbike motorbike() {
        return new Motorbike();
    }

    @Bean
    public Car car() {
        return new Car();
    }
}
