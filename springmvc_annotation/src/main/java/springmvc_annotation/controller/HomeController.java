package springmvc_annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/contact")
		public String showForm()
	{
			
		return "contact";
	}
	
  @RequestMapping(path="/processform" ,method=RequestMethod.POST)
  public String handlerForm(@RequestParam("username") String userName,@RequestParam("email_id") String email) {
	  System.out.print("UserName:"+ userName );
	  System.out.print("Email:"+ email ) ;
	return "";
	  
  }
}
