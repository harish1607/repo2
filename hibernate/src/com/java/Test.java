package com.java;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.Person;
import com.java.Address;

public class Test {
public static void main(String args[])
{
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Person p=new Person();
	p.setPersonid(101);
	p.setFirstname("harish");
	p.setLastname("mucherla");
	Address a=new Address();
	a.setCity("hyd");
	a.setState("ts");
	a.setCountry("india");
	a.setPincode("509335");
	p.setAddress(a);
	a.setPerson(p);

	tx.commit();
	session.persist(p);
	session.close();
	System.out.println("successfully stored");
	
}
}
