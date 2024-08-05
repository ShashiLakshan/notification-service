# Notification Microservice

This is a Spring Boot 3.3.2 application 
This microservice basically consumes the payment success event and booking cancelled event. If payment success, then relevant no of tickets will deduct from the event.

Other related microservices:
* Event Microservice
* Booking Microservice
* Payment Microservice

#### Swagger URL: http://localhost:8084/swagger-ui/index.html
#### Postman Collection: https://github.com/ShashiLakshan/event-service/blob/main/postman/event-booking.postman_collection.json

## Prerequisites

- Java 22 or later
- Maven 3.8.1 or later
- Docker (for Kafka)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/ShashiLakshan/notification-service.git
cd notification-service
```

### Building the Project
```bash
mvn clean install
```
### Running the Application
```bash
mvn spring-boot:run
```
The application will start and be accessible at http://localhost:8084.
