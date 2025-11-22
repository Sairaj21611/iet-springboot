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
					System.out.print("Enter id for deletion : ");
					int id = sc.nextInt();

					boolean status = pservice.deleteById(id);
					if (status) {
						System.out.println("Deleted successfully\n");
					} else {
						System.out.println("Not Deleted \n");
					}
				}
				case 3 -> {
					System.out.print("Enter id for upadation : ");
					int id = sc.nextInt();

					System.out.print("Enter the product quantity : ");
					int qty = sc.nextInt();
					
					System.out.print("Enter the price of product : ");
					Double price = sc.nextDouble();
					
					boolean status = pservice.modifyById(id,qty,price);
					
					if(status) {
						System.out.println("Updated Successfully ");
					}else {
						System.out.println("Not updated ");
					}
				}
				case 4 -> {
					System.out.print("Enter the id : ");
					int id = sc.nextInt();
					
					Product p = pservice.getById(id);
					
					if(p!=null) {
						System.out.println("The data of this id is present ");
					}else {
						System.out.println("Not found");
					}
				}
				case 5 -> {
					List<Product> plst = pservice.getAllProducts();
					plst.forEach(System.out::println);
				}
				case 6 -> {
					List<Product> plst = pservice.displayInOrder();
					plst.forEach(System.out::println);
				}
				}

			} while (choice != 6);
		}
	}
}
