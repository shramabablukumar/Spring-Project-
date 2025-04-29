package a.b.n;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyClass {
    @RequestMapping("myurl")
    public String Hello(Model m) {
        m.addAttribute("name", "CncWebWorld");
        return "index";
    }
}
