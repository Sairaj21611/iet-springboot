package com.demo.test;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestCurdOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		
		ProductService pservice = (ProductService) ctx.getBean("productServiceImpl");
		
		int choice=0;
		do {
			System.out.println("1. Add new product\n2. display all\n 3. display by category");
			System.out.println("4. display by pid\n");
			System.out.println("5. delete by id\n 6. modify by id\n 7. arrange in sorted order");
			System.out.println("8. exit\n choice :");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status = pservice.addNewProduct();
				if(status) {
					System.out.println("Product added successfully");
				}else {
					System.out.println("oops! Product not added");
				}
			}
			case 2->{
				List<Product> p = pservice.displayAll();
				p.forEach(System.out::println);
			}
			}
		}while(choice!=7);
	}
}
