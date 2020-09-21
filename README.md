## A basic example for using Spring Boot Autoconfiguration. 

A simple Spring Boot Application demonstrating the use of 
[Autoconfiguration](https://docs.spring.io/spring-boot/docs/2.1.12.RELEASE/reference/html/using-boot-auto-configuration.html).


### Build & run 

**Prerequisites:**

* Java 14
* Apache Maven (https://maven.apache.org/)

Application properties can be configured in

```bash
numbers-autoconfigure/src/main/resources
numbers-autoconfigure-client/src/main/resources
```

Use

```bash
mvn clean install
```
to build the application and

```bash
java -jar numbers-autoconfigure-client/target/numbers-autoconfigure-client-1.0.0.jar
```

or 

```bash
mvn spring-boot:run
```

to run it on your development machine.