# Spring boot course

This repository offers a simple templats for both restful API and full stack env. Each folders refers to the different fields of of Spring Components.

## Contents
* **02 - Web app using Spring Boot** - Full stack example using Spring with rest controlers and jsp's
* **03 - Junit** - Junit tests templates
* **04 - Mockito** - Creation of Mocks using mockito
* **05 - RESTful Service** - Example for a restful service
* **09 - Appendix** - First steps in Spring

## Spring Tags
@Controller - Allows classes implementationsto be autodetected through classpath scanning, i.e. looks up for different @Components<br>
@Component - Tells spring that the class is a Bean<br>
@Autowire - Avoids the new for new Class(). Tells spring to link the new instance to the class.<br>
@RequestMapping(value="/<ROUTE>", method= RequestMethod.GET) - Maps the request to <ROUTE> and specifies the type of request<br> 
@SessionAttributes("<ATTRIBUTE>") - saves <ATRIBUTE> in session, i.e. accross diferent views<br>
@InitBinder - populating command and form object arguments of annotated handler methods <br>

## Credits 
This rpeo had the help of [this course](https://www.udemy.com/course/spring-boot-tutorial-for-beginners/). Each folders refers to the different fields of the ToC defined within it.
