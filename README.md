# OrderSystem

A beginner Java Spring Boot project for learning Apache Kafka step by step.

## Current Goal

Build an order system that can receive order requests, publish order events to Kafka, and consume those events.
## Tech Stack

- Java 17
- Spring Boot
- Maven
- Apache Kafka
- Docker Desktop
- IntelliJ IDEA Community Edition
- PowerShell

## Learning Notes

### Day 1

- Created a Maven project named `OrderSystem`.
- Added Spring Boot dependencies to `pom.xml`.
- Confirmed IntelliJ is using bundled Maven 3.

## Next Steps

- Create the main Spring Boot application class.
- Run the app locally.
- Add Kafka using Docker.
- Create a producer.
- Create a consumer.

## What Works So Far

- Created a Spring Boot application.
- Added a health endpoint.
- Created an `Order` model.
- Added a sample order endpoint.
- Added a POST endpoint to receive orders.
- Tested POST requests using PowerShell.
- Added logger output when an order is received.

### Health Check

```http
GET /api/orders/health

Returns:
Order service is running
Sample Order

GET /api/orders/sample
Returns a sample order as JSON.

Create Order
POST /api/orders
Example request:
{
  "orderId": "order-2",
  "customerId": "customer-200",
  "amount": 99.99,
  "status": "CREATED"
}

PowerShell Test Command
Invoke-RestMethod `
  -Method Post `
  -Uri http://localhost:8080/api/orders `
  -ContentType "application/json" `
  -Body '{"orderId":"order-2","customerId":"customer-200","amount":99.99,"status":"CREATED"}'
```

## Learning Notes
### Spring Boot Main Class
- The main class starts the Spring Boot application using:
- SpringApplication.run(OrderSystemApplication.class, args);

### REST Controller
- A class marked with @RestController can receive HTTP requests and return responses.

### GET vs POST
- GET is used to retrieve data.
- POST is used to send data to the application.
### Request Body
- @RequestBody tells Spring Boot to convert incoming JSON into a Java object.

### Logger
- A logger prints useful runtime information in the console.
- We use:
```http
logger.info("Received order: id={}", order.getOrderId());
```
- instead of System.out.println() because logger output includes more useful information and supports log levels like INFO, WARN, and ERROR.

## Next Steps
- Start Kafka using Docker.
- Configure Spring Boot to connect to Kafka.
- Create an order producer.
- Publish the order to a Kafka topic.
- Create a Kafka consumer.