package ru.codekitchen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.codekitchen.spring.config.VehicleConfiguration;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        Vehicle vehicle1 = context.getBean("car", Vehicle.class);
        Vehicle vehicle2 = context.getBean("car", Vehicle.class);

        System.out.println("vehicle1 == vehicle2? Answer: " + (vehicle1 == vehicle2));
        System.out.println("vehicle1 memory address:" + vehicle1);
        System.out.println("vehicle2 memory address:" + vehicle2);
        context.close();



    }
}

