# Jomo Metamodel Spring Boot Application

This is a project with separate Technology based capabilities & Functional services:
1. A project that will show how to execute a Web Based Application using to Java Spring Boot, JPA/Hibernate, ThymeLeaf running into an embedded as JAR Java Application into a Tomcat App server 
2. A very consisting Java Metamodel Web Application, explaining the Metamodel - objects, entities, relations  required to implement a complete TOGAF Metamodel Application
3. A simple ThymeLeaf Web framework implementation to rapidly construct web GUI frontend components that are connected to backend Java entities
4. A Liquibase implementation example to support application schema creating, schema updates, loading testing data
5. A JPA Hibernate implementation used in the Repositories objects; that shows how to rapidly implement the persistence DB without heavy SQL hardcoding
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
- Java JRE ()
- Maven 
- GitHub
- PostGreSQL 
- H2 Java DB - in memory DB (Optional)
- IntelliJ 
- Eclipse (Optional) 
- VisualSource code (Optional) 
- GitHub Desktop (optional)
- Windows OS based computer/ laptop
- Mac OS based computer/ laptop (optional)

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

## GitHub project  | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-1.PNG "Screen 1")

3. Go to your local "Projects" folder e.g. C:\Projects\
## GitHub project  | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-3.PNG "Screen 3")

4. Open a Windows Command line program; change directory to intended C:\Projects folder - > cd C:\Projects

5. Copy the Github project repository using Git CMD command line> C:\Projects> git clone https://github.com/alexilie/jomo-metamodel-web.git
## Git Clone command  - copy repository | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-2.PNG "Screen 2")

6. New folder "jomo-metamodel-web" will be automatically created in the "Projects" folder
7. Change directory to intended new created folder "jomo-metamodel-web" > cd jomo-metamodel-web

* Observation - GitHub repository can be downloaded as ZIP archive as well; or can be downloaded using GitHub desktop or any other Git Client 

7. To build from Windows CMD line: from project folder execute Maven build command-  C:\Projects\jomo-metamodel-web > mvn clean install

## Maven build command | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-4.PNG "Screen 4")

## Maven build command | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-5.PNG "Screen 5")

## Maven build command | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-7.PNG "Screen 7")

8. Maven build script will generate auto-executable JAR Java archive in the target subfolder -  jomo-metamodel-web-app-0.0.1-SNAPSHOT
## Maven build artifacts in target folder  | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-6.PNG "Screen 6")

## Running the application
#### On Windows

9. To execute from Windows CMD line: > mvn spring-boot:run 

```
C:\Projects\jomo-metamodel-web > mvn spring-boot:run

C:\Projects\jomo-metamodel-web > mvnw.cmd spring-boot:run

C:\Projects\jomo-metamodel-web > java -jar target/jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar

C:\Projects\jomo-metamodel-web\target > java -jar jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar 
```

This will start Tomcat embedded server on port 8080, and will execute jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar inside Tomcat as Web Application 

## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-8.PNG "Screen 8")
## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-9.PNG "Screen 9")
## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-10.PNG "Screen 10")
## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-11.PNG "Screen 11")

## Accessing the Web application in the browser | screen
http://localhost:8080/

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-12.PNG "Screen 12")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-13.PNG "Screen 13")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-14.PNG "Screen 14")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-15.PNG "Screen 15")

## Accessing the Swagger UI interfaces in the browser | screen
Swagger UI - http://localhost:8080/swagger-ui/index.html
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-16.PNG "Screen 16")

## Accessing the App, App Resources & REST API resources | screen
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
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-17.PNG "Screen 17")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-18.PNG "Screen 18")

## Database ERD Model
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-19.png "Screen 19")



