package com.ofss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam(value="myName") String myName1, ModelMap map)
	{
		System.out.println("The DS has called sayHello method");
		map.addAttribute("msg","Hello ..."+myName1); // you can add the attribute “msg” here
		return "hello"; // this is nothing but the view name, hello.jsp
	}


}
