# Limits-Microservice-with-Spring-Cloud-Config
Developed a microservice named limits-service using Spring Boot 3.0.0 and Maven to demonstrate dynamic configuration management in a microservices architecture. The service exposes a REST endpoint (/limits) that returns minimum and maximum limit values, which are externally managed and fetched from a Spring Cloud Config Server.

Technologies and libraries used:

Spring Boot 3.0.0 – for building the core microservice application

Maven – for project management and dependency handling

Spring Web – to create RESTful web services

Spring Boot DevTools – for hot-reloading during development

Spring Boot Actuator – to expose operational endpoints for monitoring

Spring Cloud Starter Config – to connect the microservice to a centralized config server

Spring Cloud Config Server – to serve configuration from a file system backend

@ConfigurationProperties – to bind configuration properties to Java objects

@RestController and @GetMapping – for exposing endpoints

The config server is set up to run on port 8888 and serves properties from a native file system path (file:///E:/temp/8PM/appconfig). The limits-service fetches its configuration at runtime via spring.config.import, ensuring separation of config from code and enabling centralized control across environments.

This setup forms the foundation for building scalable, cloud-ready microservices with externalized configuration support.
