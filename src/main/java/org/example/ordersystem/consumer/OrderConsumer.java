package org.example.ordersystem.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "orders", groupId = "order-service-group")
    public void consumeOrderMessage(String message){
        logger.info("Consumed message from Kafka topic orders: {}", message );
    }
}
