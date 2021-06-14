package sf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController3 {
	 @GetMapping(value = "/fetch", params = {"personId=10"})
	  String getParams(@RequestParam("personId") String id){
	    return "Fetched parameter using params attribute = "+id;
	  }
	  @GetMapping(value = "/fetch", params = {"personId=20"})
	    String getParamsDifferent(@RequestParam("personId") String id){
	    return "Fetched parameter using params attribute = "+id;
	  }
	}


