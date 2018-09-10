# Client Service

SOAP-based web service

### How to run

1. mvn clean package
2. mvn spring-boot:run
3. Open http://localhost:8051/ws/client-service.wsdl

### How to

* see actual wsdl of this service - [here](http://localhost:8051/ws/client-service.wsdl)
* configure custom config on your machine:

    ```bash
    java -Dspring.config.location=C:\Users\yourUser\client-service-application.properties -jar yourApp.jar
    ```

* run sample with
 
    ```bash
    mvn spring-boot:run --debug
    ```
