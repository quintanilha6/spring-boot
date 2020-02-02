# Spring boot course
This repository offers a simple templats for both restful API and full stack env. Each folders refers to the different fields of of Spring Components.

## Contents
* **02 - Web app using Spring Boot** - Full stack example using Spring with rest controlers and jsp's
* **03 - Junit** - Junit tests templates
* **04 - Mockito** - Creation of Mocks using mockito
* **05 - RESTful Service** - Example for a restful service
* **09 - Appendix** - First steps in Spring

## Small Desc
* Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that devs can “just run”.
* Takes an opinionated view of the Spring platform and third-party libraries so devs can get started with minimum fuss.
* Example Problem Statements:
    * Add Hibernate to a project. Spring Boot takes care of configuring a data source and a session factory.
* Goals:
    * Provide quick start for projects with Spring.
    * Be opinionated but provide options.
    * Provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration).

## Some Important Spring Tags
@Controller* - Allows classes implementationsto be autodetected through classpath scanning, i.e. looks up for different and distinct @Components<br>
@Component/@Service* - Tells spring that the class is a Bean<br>
@Autowire - Avoids the new for new Class(). Tells spring to link the new instance to the class.<br>
@RequestMapping(value="/ROUTE", method= RequestMethod.GET) - Maps the request to ROUTE and specifies the type of request<br> 
@SessionAttributes("ATTRIBUTE") - saves ATRIBUTE in session, i.e. accross diferent views<br>
@InitBinder - populating command and form object arguments of annotated handler methods<br>
@RestController* - Types that carry this annotation are treated as controllers where @RequestMapping methods assume @ResponseBody semantics by default.<br>
@ComponentScan("PACKAGES_TO_SEARCH_FOR_DEPENDENCIES") - Searches for annotations in PACKAGES_TO_SEARCH_FOR_DEPENDENCIES<br>
@Repository* -  indicates that the decorated class is a repository. A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects.<br> 
@PathVarible - tells spring that the specific variable is a variable for the endpoint path<br>
@Profile("PROFILE") - Subsequent code only runs if PROFILE matches the active profile <br>

(*) - These are the annotations that Spring looks for on start up 

## Useful starter projects
* spring-boot-starter-web-services
* spring-boot-starter-test
* spring-boot-starter-jdbc
* spring-boot-starter-security
* spring-boot-starter-data-jpa
* spring-boot-starter-data-rest
More information about these (and other) projects [here](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#using-boot-starter)

## Credits 
This repo had the help of [this course](https://www.udemy.com/course/spring-boot-tutorial-for-beginners/). Each folder refers to the different fields of the ToC defined within it.
