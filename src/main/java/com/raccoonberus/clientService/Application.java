package com.raccoonberus.clientService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static final String SERVICE_NAME = "client-service";
    public static final String PORT_NAME = "ClientServicePort";
    public static final String STRUCTURE_RESOURCE = "/structure.xsd";
    public static final String WS_NAMESPACE_URL = "http://model.ws.clientsvc.raccoonberus.com/";
    public static final String URI_PREFIX = "/ws";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "client-service-application");
        SpringApplication.run(Application.class, args);
    }
}
