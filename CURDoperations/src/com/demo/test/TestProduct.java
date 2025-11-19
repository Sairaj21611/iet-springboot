package com.demo.test;

import com.demo.beans.Product;
import com.demo.service.*;
import java.util.*;

public class TestProduct {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ProductService pservice = new ProductServiceImpl();
			int choice = 0;
			do {
				System.out.println("1. add new product\n2. delete product\n3. modify product");
				System.out.println("4.find by Id\n5. display all\n6. display in sorted order\n7. exit");
				System.out.println("choice :");

				choice = sc.nextInt();

				switch (choice) {
				case 1 -> {
					boolean status = pservice.addNewProduct();

					if (status) {
						System.out.println("Added successfully......");
					} else {
						System.out.println("Not added......");
					}
				}
				case 2 -> {

				}
				case 3 -> {

				}
				case 4 -> {

				}
				case 5 -> {
					List<Product> plst = pservice.getAllProducts();
					plst.forEach(System.out::println);
				}
				case 6 -> {

				}
				}

			} while (choice != 6);
		}
	}
}
