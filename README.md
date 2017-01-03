# Simple Spring 4 MVC Example Using XML wiring and JPA/Hibernate.
This is a sample project showing how to use Spring MVC with XML wiring, Maven support, JPA Hibernate using a MySQL database and a simple form.

This is a VERY basic example and was created as a learning exercise. There is little in the way of validation and no testing. THis is just a proof-of-concept. In a real-world example, there would be validation, tests, etc.

This application does not use any fancy templating (it just mainly uses JSTL)
This could be used as a starting poit for a "real" application, but is not expected to be a production-ready application.

* I used the on-line tutorial/example below as my starting point, but uses common patterns seen for Spring MVC applications using XML wiring.
  - http://www.java2blog.com/2016/09/spring-mvc-spring-data-hibernate-mysql-example.html
  
  ###Make sure you create the database first and change the username/password in spring-servlet.xml
- There is a sample sql script in the /sql folder named item.sql whic can be used to create the database and item table.