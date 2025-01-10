package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		User u = new User(5, "java", 6987654, "ahmedabad");

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(u);

//		User u = new User(3, "dart", 9876854, "delhi");
//		session.update(u);
//
//		User u = session.get(User.class, 3);
//		System.out.println(u);
//		
//		session.delete(u);
//		System.out.println("deleted");
		tx.commit();
		session.close();
		sf.close();
	}
}
