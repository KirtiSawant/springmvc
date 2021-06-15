package mvcconfig.Javaconfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	@RequestMapping("/greet")
	
    public ModelAndView showview()
    {
  
        ModelAndView mv = new ModelAndView();
       System.out.println("Welcome");
        mv.addObject("result", " Welcomes "+ "you to SpringMVC!");
        mv.setViewName("result");
        return mv;
    }


}
