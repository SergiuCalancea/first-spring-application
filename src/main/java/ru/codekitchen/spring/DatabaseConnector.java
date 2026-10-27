package ru.codekitchen.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnector {

    @Value("${database-connector.host}")
    private  String databaseHost;

    @Value("${database-connector.port}")
    private  String databasePort;

    @Value("${database-connector.credentials.username}")
    private  String databaseUser;

    @Value("${database-connector.credentials.password}")
    private  String databasePassword;



    public void executeSql(String sql){
        System.out.println("Connecting: https://" + databaseHost + ":" + databasePort + "?username" + databaseUser + "&password=" + databasePassword);
        System.out.println("Executing provided SQL [" + sql + "]...");
        System.out.println("Provided SQL was successfully executed!");
    }


}
