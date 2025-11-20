package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.demo.beans.*;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
public class ProductServiceImpl implements ProductService {
	
	private ProductDao pdao;
	

	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}


	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id");
		int pid = sc.nextInt();
		System.out.println("Enter Name of the Product");
	    String pname = sc.next();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		System.out.println("Enter mngDate (DD/MM/YYYY)");
		String dt = sc.next();
		LocalDate ltd = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Products pd = new Products(pid,pname,qty,price,ltd);
		return pdao.save(pd);
	}
	
	

}
