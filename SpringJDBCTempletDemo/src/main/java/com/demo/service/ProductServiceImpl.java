package com.demo.service;
import com.demo.dao.*;
import com.demo.beans.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean addNewProduct() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id of the product : ");
		int pid = sc.nextInt();
		
		System.out.print("Enter Name of the product : ");
		String pname = sc.next();
		
		System.out.print("Enter quantity of the product : ");
		int qty = sc.nextInt();
		
		System.out.print("Enter price of the product : ");
		double price = sc.nextDouble();
		
		System.out.print("Enter Date (dd/MM/yyyy) : ");
		String ldt = sc.next();
		LocalDate mfgdate = LocalDate.parse(ldt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Entet the customer id : ");
		int cid = sc.nextInt();
		
		Product p = new Product(pid,pname,qty,price,mfgdate,cid);
		
		return pdao.save(p);
		
	
	}

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.getAll();
	}
}
