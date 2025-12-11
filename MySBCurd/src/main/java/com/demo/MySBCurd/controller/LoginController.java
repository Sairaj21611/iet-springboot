package com.demo.MySBCurd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.MySBCurd.beans.LoginUser;
import com.demo.MySBCurd.service.LoginService;

import jakarta.servlet.http.HttpSession;




@Controller
@RequestMapping("/login")
	public class LoginController {
		
	@Autowired
	LoginService lservice;
	
	@GetMapping("/loginuser")
	public String loginuser() {
		return "loginpage";
	}
	
	@PostMapping("/validateuser")
	public ModelAndView validateUser(HttpSession httpsession, @RequestParam ("uname") String uname,@RequestParam ("pass") String password) {
		LoginUser myuser = lservice.validateUser(uname,password);
		
		if(myuser!=null) {
			httpsession.setAttribute("myuser", myuser);
			
			return new ModelAndView("redirect:/product/showproducts");
			
		}
		return new ModelAndView("loginpage","message","Invalid credantials");
		
	}
}
