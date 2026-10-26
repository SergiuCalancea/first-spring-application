package ru.codekitchen.spring;

import org.springframework.stereotype.Component;


public class Car implements Vehicle {


    public Car() {
        System.out.println("Car bean is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Car : wrooom-wrooom!");
    }
}
