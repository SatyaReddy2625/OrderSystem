package org.example.ordersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is starting point of Spring Boot application.
 * @author satya
 * @version 06/27/2026
 */
@SpringBootApplication
public class OrderSystemApplication {

    /**
     * This Spring Boot app Starts scanning from this package.
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(OrderSystemApplication.class, args);
    }
}
