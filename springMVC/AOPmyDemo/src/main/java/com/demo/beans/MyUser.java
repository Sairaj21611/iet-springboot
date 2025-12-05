package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MyUser {

	@Value("Sairaj")
	 private String name;

	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + "]";
	}
	
	public void m1() {
		System.out.println("In m1");
	}
	
	public int m2(int x) {
		System.out.println("In m2 "+x);
		return x+10;
	}
	 
	 
}
