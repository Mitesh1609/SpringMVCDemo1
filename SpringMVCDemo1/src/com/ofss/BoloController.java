package com.ofss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoloController {
	
	@RequestMapping(value="bolo", method=RequestMethod.GET)
	public String sayBolo() {
		System.out.println("bolo");
		return "bolo";
	}


}
