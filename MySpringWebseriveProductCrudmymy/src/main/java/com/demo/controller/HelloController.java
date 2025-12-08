package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello world";
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok("Welcome to the Webservices");
	}
}
