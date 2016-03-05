# Sample Spring Boot CLI groovy app
A simple groovy project for instantiating a Tomcat server and displaying a web page.


## Requirements

* Spring Boot CLI [installation instructions](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html#getting-started-installing-the-cli) 
* Java 1.8 (I run 1.8.0_66-b17)
* Groovy 2.4.5 or greater

## Usage

<pre>
git clone https://github.com/geocolumbus/springbootgroovycli.git gr1
cd gr1
spring run .
# navigate to localhost:8080 in your browser
</pre>

Make an executable jar if you wish:

<pre>
spring jar simple-groovy-app.jar .
</pre>

## Simple server side code

Very little code is required for the server side:

<pre>
// In the Grabs.groovy file.
// Instructs the Spring Boot CLI to use the thymeleaf template engine.
@Grab("spring-boot-starter-thymeleaf")
class Grabs {}

// In the AppController.groovy file.
// The Spring Boot CLI will see this and include "spring-boot-starter-web".
// Because we included thymeleaf, the "index" will cause templates/index.html to be loaded
// to localhost:8080
@Controller
class AppController {

    @RequestMapping("/")
    def home() {
        return "index";
    }
}
</pre>

## Client Side Code

The client side code is the html in the templates folder and the css in the static folder.