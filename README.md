HRMS Project
I developed a web project with Java and Spring Boot. I had joined Java bootcamp which organized by kodlama.io and I have completed this project at the end of the bootcamp. 
What is this Project?
This project had been designed as human research management system back-end. It has structures that a user can login, register, load the CV, look and sort the job advertisement or add the job advertisement. It is like kariyer.net

General Information:
•	Spring Boot (v2.4.5) was used in this project.
•	The dependencies are as follows:
o	spring-boot-(jpa,web,devtools,test)
o	lombak
o	swagger2
•	Hibernate was used for ORM tool in this project.
•	I used relational database architecture with PostgreSql in this project
•	I created a layered architecture.
o	Entities: Built for database objects
o	Business: It is the Business layer that will be created for processing or content based on the conditions required for requests. In addition, it has business rules
o	DataAccess: Built to perform CRUD operations on the database. If there is a problem on business layer, the request will not come here. All interface extends JPARepository and this built let us to write HQL for access to data
o	Core: It is a framework layer. Contains the utilities package. this layer can be used in other projects in the same way
o	Web API: It has controllers. It is like a bridge because this layer connects back-end with front-end (web, mobile app, desktop app…)
