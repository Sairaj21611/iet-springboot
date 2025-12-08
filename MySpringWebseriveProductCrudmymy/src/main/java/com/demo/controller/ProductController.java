package com.demo.controller;
import com.demo.dto.ProductDto;
import com.demo.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	public ProductService pservice;
	
	@GetMapping("/product")
	public ResponseEntity<List<ProductDto>> getAllProduct(){
		
		List<ProductDto> p = pservice.getAllProducts();
		return ResponseEntity.ok(p);
	}
}
