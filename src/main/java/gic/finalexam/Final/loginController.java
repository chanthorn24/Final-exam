package gic.finalexam.Final;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
	
	@GetMapping("/")
	public String index() {
		return "login";
	}
}
