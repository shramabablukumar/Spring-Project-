package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee {

    @RequestMapping("Hellourl")
    public String Hello() {
        return "index";
    }
}
