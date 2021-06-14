package sf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class IndexController {
	@RequestMapping(value= {"","/page","page*","view/*,**/msg"})
	public String indexMapping()
	{
		return "Hello from Index Controller";
	}

}
