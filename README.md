# Jomo Metamodel Spring Boot Application

This is a project with separate capabilities and functional services:
1. A project that will show how to execute a Web Based Application using to  Spring Boot + JPA/Hibernate, running into an embedded Tomcat server
2. A very consisting Java Metamodel application, explaining the objects, entities required to implement a complete TOGAF Metamodel Application
3. A ThymeLeaf Web framework to rapidly construct web frontend components that are connected to backend Java entities
4. A Liquibase implementation example to support application schema creating, schema updates, loading testing data
5. A JPS Hibernate implementation used in the Repositories objects; that shows how to rapidly implement the persistence DB without heavy SQL hardcoding
6. A set of REST API implementation
7. An example how to quickly generate Open API 3.0 YAML docs and Swagger UI Web interface to document and execute the REST APIs
7. An example how to configure Spring-Boot Actuator 

The project is built using Java, Spring Boot, Hibernate, Liquibase.

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
                                                              
## Getting the application source and files from GitHub; build local project
1. Please go to the following GitHub project https://github.com/alexilie/jomo-metamodel-web
2. Copy the Git project command https://github.com/alexilie/jomo-metamodel-web.git
3. Go to your local "Projects" folder e.g. C:\Projects\
4. Open a Windows Command line program; change directory to intended C:\Projects folder - > cd C:\Projects
5. New folder "jomo-metamodel-web" will be automatically created in the "Projects" folder
6. Change directory to intended new created folder "jomo-metamodel-web" > cd jomo-metamodel-web
7. To build from Windows CMD line: from project folder execute -  C:\Projects\jomo-metamodel-web > mvn clean install
8. Maven build script will generate auto-executable JAR Java archive in the target subfolder -  jomo-metamodel-web-app-0.0.1-SNAPSHOT

## Running the application
#### On Windows

9. To execute from Windows CMD line: > mvn clean install 
```bash
C:\Projects\jomo-metamodel-web > mvn spring-boot:run
```
or
```bash
C:\Projects\jomo-metamodel-web > mvnw.cmd spring-boot:run
```
or
```bash
C:\Projects\jomo-metamodel-web > java -jar target/jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar
```
or
```bash
C:\Projects\jomo-metamodel-web\target > java -jar jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar 
```

This will start Tomcat embedded server on port 8080, and will execute jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar insoide tomcat as Web Application 

## Accessing the Web application in the browser
http://localhost:8080/

## Accessing the Swagger UI interfaces in the browser
Swagger UI - http://localhost:8080/swagger-ui/index.html

## Accessing the Resources & REST API 

| Resource        |  URL         	                                     |          |
|------------------------------------------------------------------------|----------|---------- |
| App Home         | http://localhost:8080                               | 
| Swagger UI       | http://localhost:8080/swagger-ui/index.html         | 
| Open API 3.0 YAML| http://localhost:8080/swagger-ui/index.html         | 
| Actuator         | http://localhost:8080/actuator                      | 
| Applications API | http://localhost:8080/api/v1/metamodel/applications | 
| Components API   | http://localhost:8080/api/v1/metamodel/applications |  
| Databases API    | http://localhost:8080/api/v1/metamodel/applications |  
| Domains API      | http://localhost:8080/api/v1/metamodel/applications |  
| Environments API | http://localhost:8080/api/v1/metamodel/applications |   
| Releases API     | http://localhost:8080/api/v1/metamodel/applications |   
| Releases API     | http://localhost:8080/api/v1/metamodel/applications |   

## Accessing the REST API directly using CURL from Windows CMD line

## Accessing the REST API directly using PostMan 

## Database user
| JDBC URL                                      | Username         	| Password         |
|----------------------------------------------	|------------------	|----------------- |
| jdbc:postgresql://localhost:5555/eorganism_web| eorganism_web     | alex1900 |

## Database Screens

## Database ERD Model