package m.s.p;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyClass {
	@RequestMapping("myurl")
	public String Hello() {
		return "index";
		
	}

}
