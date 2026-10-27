package ru.codekitchen.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.codekitchen.spring.config.ApplicationConfiguration;



public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Person person = context.getBean("person", Person.class);
        person.startVehicleEngine();
        person.callPat();
        context.close();



    }
}

