package com.demo.test;

import java.util.*;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductManagement {
	public static void main(String[] args) {
		ProductService pservice = new ProductServiceImpl();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. add new product\n2. delete product\n3. modify product");
			System.out.println("4.find by Id\n5. display all\n6. display in sorted order\n7. exit");
			System.out.println("choice :");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				boolean status = pservice.addNewProduct();
				if(status) {
					System.out.println("The Product is Added");
				}else {
				System.out.println("Unable to add the Product");
				}
			}
			case 2 -> {

			}
			case 3 -> {

			}
			case 4 -> {

			}
			case 5 -> {

			}
			case 6 -> {

			}

			}

		} while (choice != 7);
	}

}
