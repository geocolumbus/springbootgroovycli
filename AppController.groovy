@Controller
class AppController {

    @RequestMapping("/")
    def home() {
        return "index";
    }
}