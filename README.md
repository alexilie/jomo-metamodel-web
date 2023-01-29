# Jomo Metamodel Spring Boot Application

This project will provide separate Technology based capabilities & Functional services:
1. Web Based Spring Boot Application that uses Java Spring Boot, JPA/Hibernate, ThymeLeaf running into an embedded Tomcat App server, executed as JAR Java Application 
2. Metamodel Web Application, explaining the Metamodel - objects, entities, relations  required to implement a complete TOGAF Metamodel Application
3. ThymeLeaf Web framework implementation to rapidly construct web GUI frontend components that are connected to backend Java entities
4. Liquibase implementation  to support DB schema creating, schema updates, loading testing data
5. JPA Hibernate implementation used in the Repositories objects; that shows how to rapidly implement the persistence DB without heavy SQL hardcoding
6. REST API implementation
7. Open API 3.0 YAML docs
8. Swagger UI Web interface to document, test & execute the REST APIs
9. Spring-Boot Actuator for Application Health 

The project is built using Java 8, Spring Boot, Hibernate, Liquibase, ThymeLeaf.

## Credits and related project
This Project is build using few resources:
1. Daniel Michalski Liquibase related project code: https://github.com/DanielMichalski/spring-boot-java-swing-reservations
https://danielmichalski.com/
https://github.com/danielmichalski

2. Sample Trackzilla Application for TheymeLeaf, REST API
Github Trackzilla Application URL = TO DO

3. Jomo EOrganism Metamodel Swing Application - Entity Model, DB model : https://github.com/alexilie/spring-boot-swing-metamodel

4. Jomo Static Web site - for rendering ReadMe.md documentation images from external website: https://github.com/alexilie/jomo-static-website


## Table of Contents
* [Prerequisites](#prerequisites)
* [Libraries](#libraries)
* [Running the application](#running-the-application)
    * [On Windows](#on-windows)
    * [On Mac](#on-mac) - to do
* [Database user](#database-user)
* [Screens](#screens)

## Prerequisites
- [Java JDK](https://www.oracle.com/pl/java/technologies/javase-downloads.html) version 8+
- Java JRE 8+
- Maven 
- GitHub
- Git client (command line tool)
- PostGreSQL 
- H2 Java DB - in memory DB (Optional)
- IntelliJ 
- Eclipse (Optional) 
- VisualSource Code (Optional) 
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
1. Go to the following GitHub project https://github.com/alexilie/jomo-metamodel-web
2. Copy the Git project using "git clone" command ...> got clone https://github.com/alexilie/jomo-metamodel-web.git

## GitHub project  | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-1.PNG "Screen 1")

3. Go to your local "Projects" or create a local working folder; for exmaple purpose we will this folder e.g. C:\Projects

4. Open a Windows Command line program; change directory to intended C:\Projects folder - > cd C:\Projects

5. From Windows CMD; Copy the Github project repository using Git CMD command line> C:\Projects> git clone https://github.com/alexilie/jomo-metamodel-web.git
## Git Clone command  - copy repository | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-2.PNG "Screen 2")

6. After "Git clone" command is executed, a ew folder "jomo-metamodel-web" will be automatically created in the working "Projects" folder
7. Change directory to the new created folder "jomo-metamodel-web" > cd jomo-metamodel-web

* Observation - GitHub repository can be downloaded as ZIP archive as well; or can be downloaded using GitHub desktop or any other Git Client 

8. Build application from Windows CMD line: from project folder execute Maven build  "mvn clean install" command-  C:\Projects\jomo-metamodel-web > mvn clean install

* Observation - Build application from Intellij - start IntelliJ, Open Project from "jomo-metamodel-web" folder, open terminal, or launch the build using Maven from inside IntelliJ


## Maven build command | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-3.PNG "Screen 3")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-4.PNG "Screen 4")

## Maven build command | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-5.PNG "Screen 5")

9. Opne IntelliJ IDE (if not done yet) and open Project from following location C:\Projects\jomo-metamodel-web > mvn clean install
## IntelliJ IDE jomo-metamodel-web App | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-7.PNG "Screen 7")

8. Maven build script will generate auto-executable JAR Java archive in the target subfolder -  jomo-metamodel-web-app-0.0.1-SNAPSHOT
## Maven build artifacts in target folder  | screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-6.PNG "Screen 6")

## Running the Spring-boot jomo-metamodel-web as Web App inside Tomcat App server
#### On Windows

9. To execute from Windows CMD line or IntelliJ Terminal command window: > mvn spring-boot:run 
you can use any Maven commands 
```
C:\Projects\jomo-metamodel-web > mvn spring-boot:run

C:\Projects\jomo-metamodel-web > mvnw.cmd spring-boot:run

C:\Projects\jomo-metamodel-web > java -jar target/jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar

C:\Projects\jomo-metamodel-web\target > java -jar jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar 
```

the Mavn command "mvn spring-boot:run" will start Tomcat App Server on port 8080, then will deploy the jomo-metamodel-web-app-0.0.1-SNAPSHOT.jar JAR in the Tomcat embedded server

## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-8.PNG "Screen 8")
## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-9.PNG "Screen 9")
## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-10.PNG "Screen 10")
## Maven command to run and execute the application | screen 
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-11.PNG "Screen 11")

## Accessing the Metamodel Web application in the browser | screen
http://localhost:8080/

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-12.PNG "Screen 12")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-13.PNG "Screen 13")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-14.PNG "Screen 14")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-15.PNG "Screen 15")

## Accessing the App, App Resources & REST API resources | screen
| Resource        |  URL         	                                     |          |
|------------------------------------------------------------------------|----------|---------- |
| App Home         | http://localhost:8080                               | 
| Swagger UI       | http://localhost:8080/swagger-ui/index.html         | 
| Open API 3.0 YAML| http://localhost:8080/v3/api-docs                   | 
| Actuator         | http://localhost:8080/actuator                      | 
| Applications API | http://localhost:8080/api/v1/metamodel/applications | 
| Components API   | http://localhost:8080/api/v1/metamodel/components   |  
| Databases API    | http://localhost:8080/api/v1/metamodel/databases    |  
| Domains API      | http://localhost:8080/api/v1/metamodel/domains      |  
| Environments API | http://localhost:8080/api/v1/metamodel/environments |   
| Releases API     | http://localhost:8080/api/v1/metamodel/releases     |   
| Metadatas API    | http://localhost:8080/api/v1/metamodel/metadatas    |   

## Metamodel Application | PostgreSQL Database configuration - | screen
* Observation - For PostGreSQL; database must be created, user must be created and password must be setup; user permission must be setup as well - READ, WRITE 
* Observation - Datasource configured and can be changed from application.yml config file 

Database:    eorganism_web
DB user:     eorganism_web
DB password: alex1900 
DB port:     5555 
DB host:     localhost
Dn Driver:  

| JDBC URL                                      | Username         	| Password         |
|----------------------------------------------	|------------------	|----------------- |
| jdbc:postgresql://localhost:5555/eorganism_web| eorganism_web     | alex1900 |


## PostgreSQL Database configuration |  Screens
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-17.PNG "Screen 17")

![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-18.PNG "Screen 18")

## PostgreSQL Database ERD Model |  Screen
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-19.png "Screen 19")


## Metamodel Application | H2 Java DB (in memory DB) | Database configuration - | screen
* Observation - For H2 Java DB; database will be automatically created, default
Database:    
DB user:     
DB password:  
DB port:      
DB host:     localhost
Dn Driver:  

| JDBC URL                                      | Username         	| Password         |
|----------------------------------------------	|------------------	|----------------- |
| jdbc:h2://localhost:xxxx/default              |                   |                  |

## Accessing the REST API GET operations | directly in the browser | screens
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-20.PNG "Screen 20")
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-21.PNG "Screen 21")
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-22.PNG "Screen 22")
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-23.PNG "Screen 23")\
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-24.PNG "Screen 24")
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-25.PNG "Screen 25")

## Swagger UI | screen
Swagger UI - http://localhost:8080/swagger-ui/index.html
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-16.PNG "Screen 16")

## Spring Boot Actuator | screen
Actuator Health Info - http://localhost:8080/actuator
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-26.PNG "Screen 26")

## OpenAPI 3.0 YAML specification - Swagger REST API interfaces specs | screen
OpenAPI 3.0 YAML specification | from app - http://localhost:8080/v3/api-docs
OpenAPI 3.0 YAML specification | remote- https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/api-docs.yaml
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-27.PNG "Screen 27")


## REST API GET | using CURL  Windows CMD line
REST API - CURL from CMD Command line - getting all - http://localhost:8080/api/v1/metamodel/metadatas
curl HTTP GET http://localhost:8080/api/v1/metamodel/metadatas
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-28.PNG "Screen 28")

REST API - GET metadatas REST API | CURL  CMD Command line - getting one - http://localhost:8080/api/v1/metamodel/metadatas/50
curl HTTP GET http://localhost:8080/api/v1/metamodel/metadatas/50
![alt text](https://main.d37vqs13py7d1c.amplifyapp.com/images/metamodel/jomo-metamodel-web-img-29.PNG "Screen 29")

## Accessing the REST API directly using PostMan 
TO DO



