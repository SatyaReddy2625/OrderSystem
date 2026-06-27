package org.example.ordersystem.controller;

import org.example.ordersystem.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class can receive HTTP requests and return responses.
 */
@RestController
public class OrderController {

    /**
     * This method is used to map to health page.
     * @return String to check the application.
     */
    @GetMapping ("/api/orders/health")
    public String healthcheck(){
        return "Order service is running";
    }

    @GetMapping ("/api/orders/sample")
    public Order getSampleOrder(){
        return new Order("Order01", "customer01",50.0, "Created");
    }
}
