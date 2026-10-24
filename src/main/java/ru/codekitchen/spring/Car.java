package ru.codekitchen.spring;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car : wrooom-wrooom!");
    }
}
