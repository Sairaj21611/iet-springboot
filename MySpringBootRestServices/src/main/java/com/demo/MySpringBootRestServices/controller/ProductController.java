package com.demo.MySpringBootRestServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.MySpringBootRestServices.service.*;

import jakarta.annotation.PostConstruct;

import com.demo.MySpringBootRestServices.beans.Product;
import com.demo.MySpringBootRestServices.dto.ProductDto;

@RestController
public class ProductController {
	
	@Autowired
	public ProductService pservice;
	
	@GetMapping("/product")
	public ResponseEntity<List<ProductDto>> getAllProducts(){
		
		List<ProductDto> plist = pservice.getAllProducts();
		
		return ResponseEntity.ok(plist);
		
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/product/{pid}")
	public ResponseEntity<ProductDto> getById(@PathVariable int pid){
		
		ProductDto p = pservice.getById(pid);
		
		if(p!=null) {
			return ResponseEntity.ok(p);
		}
		return (ResponseEntity<ProductDto>) ResponseEntity.notFound();
		
	}
	
	@PostMapping("/product")
	public ResponseEntity<String> addProduct(@RequestBody ProductDto p) {
		
		boolean status = pservice.addProduct(p);
		
		if(status) {
			return ResponseEntity.ok("Product added successfully");
		}else {
			return ResponseEntity.ok("Product not added ");
		}
		
	}
	
	@PutMapping("/product/{pid}")
	public ResponseEntity<String> updateProduct(@RequestBody ProductDto id){
		boolean status = pservice.updateProduct(id);
		if(status) {
			return ResponseEntity.ok("Product updated successfully");
		}else {
			return ResponseEntity.ok("Error updating");
		}
	}
	
}
