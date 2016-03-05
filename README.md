# Sample Spring Boot CLI app
A simple groovy project for instantiating a Tomcat server and displaying a web page.

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