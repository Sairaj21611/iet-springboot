
package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Items;

public class TestSave {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
//		Items i = session.get(Items.class, 6);
//		System.out.println(i);
		
		Cart c = session.get(Cart.class, 5);
		System.out.println(c);
		
		tr.commit();
		session.close();
		sf.close();
	}
}
