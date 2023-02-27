package com.bitlabs.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Student;

public class Dao_Impl implements Dao_Interface {

	public void insert() {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Student st = new Student();
		
		//st.setId(101);
		st.setName("Vijay");
		st.setMarks(535);
		st.setCollege_name("CBIT");
		
		Transaction tx = ss.beginTransaction();
		
		
		
		ss.save(st);
		tx.commit();
		ss.close();
	}

	public void viewAllData() {
SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Student st = new Student();
		
		Query qe = ss.createQuery("  from Student");
		
		List <Student> li = new ArrayList();
		
		li=qe.list();
		
		for(Student a :li) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getMarks()+" "+a.getCollege_name());
		}
		ss.close();
		
	}

	public void updateName(int id) {
SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Student st = ss.get(Student.class,1);
		
		Transaction tx = ss.beginTransaction();
		
		st.setName("Vikram");
		
		System.out.println("Updated Successfully");
		
		ss.save(st);
		tx.commit();
		ss.close();
		
		
		
		
		
		
		
		ss.close();
		
	}

	public void delete(int id) {
SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session ss = sf.openSession();
		
		Student st = ss.get(Student.class,1);
		
		Transaction tx = ss.beginTransaction();
		
		st.setName("Vikram");
		
		System.out.println("Deleted Successfully");
		
		ss.delete(st);
		tx.commit();
		ss.close();
		
	}

}
