# Spring boot course

This repository offers a simple templats for both restful API and full stack env. Each folders refers to the different fields of of Spring Components.

## Contents
* **02 - Web app using Spring Boot** - Full stack example using Spring with rest controlers and jsp's
* **03 - Junit** - Junit tests templates
* **04 - Mockito** - Creation of Mocks using mockito
* **05 - RESTful Service** - Example for a restful service
* **09 - Appendix** - First steps in Spring

## Spring Tags
@Controller* - Allows classes implementationsto be autodetected through classpath scanning, i.e. looks up for different and distinct @Components<br>
@Component/@Service* - Tells spring that the class is a Bean<br>
@Autowire - Avoids the new for new Class(). Tells spring to link the new instance to the class.<br>
@RequestMapping(value="/ROUTE", method= RequestMethod.GET) - Maps the request to ROUTE and specifies the type of request<br> 
@SessionAttributes("ATTRIBUTE") - saves ATRIBUTE in session, i.e. accross diferent views<br>
@InitBinder - populating command and form object arguments of annotated handler methods<br>
@RestController* - Types that carry this annotation are treated as controllers where @RequestMapping methods assume @ResponseBody semantics by default.<br>
@ComponentScan("PACKAGES_TO_SEARCH_FOR_DEPENDENCIES") - Searches for annotations in PACKAGES_TO_SEARCH_FOR_DEPENDENCIES<br>
@Repository* -  indicates that the decorated class is a repository. A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects.<br> 

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
This repo had the help of [this course](https://www.udemy.com/course/spring-boot-tutorial-for-beginners/). Each folders refers to the different fields of the ToC defined within it.
