package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@GetMapping("/showproduct")
	public ModelAndView getAllProducts(HttpSession session) {
		
		MyUser user = (MyUser) session.getAttribute("uname");
		if(user!=null && user.getRole().equals("piun")) {
			List<Product> plist = pservice.getAllProduct();
			return new ModelAndView("showproduct","plist",plist);
		}else {
			return new ModelAndView("loginpage","message","please provide credentials");
		}
	}
	

}
