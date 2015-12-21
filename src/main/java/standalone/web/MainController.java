package standalone.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/naver")
	public String listQuakes() {
		return "naver/list";
	}
}
