package ru.codekitchen.spring;




public class Motorbike implements Vehicle {

    public Motorbike() {
        System.out.println("Motorbike bean is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorbike : trrrrrrrr");
    }
}
