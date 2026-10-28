package ru.codekitchen.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        DatabaseConnector connector = context.getBean("databaseConnector", DatabaseConnector.class);

        connector.executeSql("SELECT * FROM students");

        context.close();

    }
}

