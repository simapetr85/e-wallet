package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private int count = 0;

    @RequestMapping("/")
    public String index() {
        count = count + 1;

        System.out.println(count);

        return "Greetings from Spring Boot!";
    }

}
