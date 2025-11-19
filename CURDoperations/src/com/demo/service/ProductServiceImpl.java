package com.demo.service;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.beans.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class ProductServiceImpl implements ProductService {
	ProductDao pdao;
	
	public ProductServiceImpl() {
		this.pdao = new ProductDaoImpl();
	}

	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter id of product : ");
		int pid = sc.nextInt();
		
		System.out.print("Enter product name : ");
		String pname = sc.next();
		
		System.out.print("Enter product quantity : ");
		int qty = sc.nextInt();
		
		
		System.out.print("Enter product price : ");
		double price = sc.nextDouble();
		
		System.out.print("Enter Date : ");
		String pdate = sc.next();
		LocalDate ldt = LocalDate.parse(pdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p = new Product(pid,pname,qty,price,ldt);
		return pdao.save(p);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return pdao.findAllProducts();
	}
	
}
