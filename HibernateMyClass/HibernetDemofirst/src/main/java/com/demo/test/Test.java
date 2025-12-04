package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Person;
import com.demo.beans.Sports;


public class Test {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Sports s = new Sports(2,"cricket");
		Person p = new Person(4,"samarth","samarthdeshmukh@gmail.com","3445778578",s);
		
		
		session.save(s);
		session.save(p);
		
		tr.commit();
		session.close();
		sf.close();
		
	}
}
