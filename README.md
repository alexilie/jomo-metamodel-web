# Jomo Metamodel Spring Boot Application

This project will show how to create a Spring Boot + JPA/Hibernate Java application.
The project is built using Java, Spring Boot.

## Table of Contents
* [Prerequisites](#prerequisites)
* [Libraries](#libraries)
* [Running the application](#running-the-application)
    * [On Windows](#on-windows)
* [Database user](#database-user)
* [Screens](#screens)

## Prerequisites
- [Java JDK](https://www.oracle.com/pl/java/technologies/javase-downloads.html) version 8+

## Libraries
| Library name                                                                                                     | Description                                                                                                                          |
|------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| [Spring Boot 2](https://spring.io/projects/spring-boot)                                                          | Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".                 |
| [Spring Data Repositories](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories) | The JPA module of Spring Data contains a custom namespace that allows defining repository beans.                                     |
| [JPA (Hibernate)](https://hibernate.org/)                                                                        | Hibernate ORM enables developers to more easily write applications whose data outlives the application process.                      |
| [Liquibase](https://www.liquibase.org/)                                                                          | Liquibase Community is an open source project that helps millions of developers rapidly manage database schema changes.              | 
| [Lombok](https://projectlombok.org/)                                                                             | Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.                    |
                                                              
## Running the application
#### On Windows
```bash

## Build application using Maven Wrapper
mvn clean install

## Run Spring boot application using Maven Wrapper or simply run Application class
mvn spring-boot:run
```



## Database user
| JDBC URL                                      | Username         	| Password         |
|----------------------------------------------	|------------------	|----------------- |
| jdbc:postgresql://localhost:5555/eorganism_web | eorganism_web | alex1900 |

## Screens