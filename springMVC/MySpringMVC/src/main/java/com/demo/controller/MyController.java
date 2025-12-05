package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}

	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String msg = "welcome msg frm controller";
		return new ModelAndView("welcome", "message", msg);
	}

	@GetMapping("/test")
	public String testdata(Model mymodel) {
		mymodel.addAttribute("name", "Saket");
		mymodel.addAttribute("email", "saket5102001@gmail.com");
		return "test";
	}

}
