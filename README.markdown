
A basic Java web application, ready to roll.

The application uses:
* Maven2 for build, dependencies and project properties
* Spring 3.0.5 core and MVC libraries
* Sitemesh for page decoration
* Log4j 1.2.9
* Servlet API 2.4, JSP and JSTL 1.1.2
* Hibernate 3.2.6ga (along with Spring Hibernate 2.0.8)

After checking the project out, you can start a local Jetty server with:
`mvn jetty:run`

An override web.xml is applied to this Jetty to ensure static files (CSS, JS and images) are served using the DefaultServlet. All other URLs are mapped to spring-mvc.

References to sampleapp should be updated for your project. Hint: check in pom.xml, web.xml, spring-mvc-servlet.xml, log4j.xml and package names.
