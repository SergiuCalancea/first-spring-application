package ru.codekitchen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person bean is created");
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person bean: set value to vehicle field");
    }

    public void startVehicleEngine(){
        System.out.println("Person is starting vehicle engine....");
        vehicle.startEngine();
    }
}
