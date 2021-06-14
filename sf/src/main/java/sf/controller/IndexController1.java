package sf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class IndexController1 {
	@RequestMapping(value="/name")
	public String getName(@RequestParam(value="person",required=false)String personName) {
		
		return "Required element of request param";
		
	}
	/*
	@RequestMapping(value="/name")
	public String getName(@RequestParam(value="person",defaultValue="abc")String personName) {
		
		return "Hello from controller & my Name is:"+personName;
		
	}
	*/

}
