package org.example.ordersystem.controller;

import org.apache.kafka.common.requests.OffsetDeleteRequest;
import org.example.ordersystem.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import java.util.logging.Logger;

/**
 * This class can receive HTTP requests and return responses.
 */
@RestController
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

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

    /**
     * This method handles POST requests sent to /api/orders.
     * @param order represents the Order class.
     * @return Take the JSON from the request body and convert it into a Java Order object.
     */
    @PostMapping ("/api/orders")
    public Order createOrder(@RequestBody Order order){

        logger.info("Received order orderId={}, customerId = {}, cost = {}, status ={} ",
                order.getOrderId(),
                order.getCustomerId(),
                order.getAmount(),
                order.getStatus());
        return order;
    }
}
