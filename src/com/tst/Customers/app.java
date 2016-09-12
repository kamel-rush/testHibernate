package com.tst.Customers;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Hibernate one to one (XML mapping)");
	
				Session session = (new Configuration().configure().buildSessionFactory()).openSession();

				session.beginTransaction();

				Customer c = new Customer();
				
				c.setCustomerid("Jacky");
				c.setCompanyname("GC");

				session.save(c);// insert statement 
				session.getTransaction().commit();

				System.out.println("Done");
	}
}
