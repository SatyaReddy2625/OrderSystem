package org.example.ordersystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping ("/api/orders/health")
    public String healthcheck(){
        return "Order service is running";
    }
}
