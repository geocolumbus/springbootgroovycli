# Sample Spring Boot CLI app
A simple groovy project for instantiating a Tomcat server and displaying a web page.


## Requirements

* Spring Boot CLI [installation instructions](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html#getting-started-installing-the-cli) 
* Java 1.8 (I run 1.8.0_66-b17)
* Groovy 2.4.5 or greater

## Usage

<pre>
git clone https://github.com/geocolumbus/springbootgroovycli.git gr1
cd gr1
sprint run .
# navigate to localhost:8080 in your browser
</pre>

## Simple server side code

This is the total amount of groovy code I had to write!

<pre>
// In the Grabs.groovy file
@Grab("spring-boot-starter-thymeleaf")
class Grabs {}

// In the AppController.groovy file
@Controller
class AppController {

    @RequestMapping("/")
    def home() {
        return "index";
    }
}
</pre>

The rest of the code is the html in the templates folder and the css in the static folder.