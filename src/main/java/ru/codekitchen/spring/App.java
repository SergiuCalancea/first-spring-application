package ru.codekitchen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ru.codekitchen.spring");

        Person person = context.getBean("person", Person.class);
        person.startVehicleEngine();



        context.close();

    }
}

