package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

public class TestUserAndAdress {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("springconfig.xml");
		
		MyUser myuser = (MyUser) ap.getBean("myuser");
		System.out.println(myuser);
		
		((AbstractApplicationContext) ap).close();
		
		
	}
}
