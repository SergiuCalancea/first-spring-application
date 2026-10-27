package ru.codekitchen.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("ru.codekitchen.spring")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

}
