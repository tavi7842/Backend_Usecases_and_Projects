package com.bitlabs.Daolayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Student;


public class StudentDao implements Student_Interface {
	Scanner sc = new Scanner(System.in);

	public void insert() {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		System.out.println("Enter the Student_name");
		String name = sc.next();
		System.out.println("Enter the Student_city");
		String city = sc.next();
		System.out.println("Enter the Student_marks");
		int marks=sc.nextInt();
		System.out.println("Enter the Student_rating");
		int rating=sc.nextInt();
		
		Student st = new Student();
		
		
		st.setName(name);
		st.setCity(city);
		st.setMarks(marks);
		st.setRating(rating);
		
		ss.save(st);
		tx.commit();
		ss.close();
		
	}

	public void descend() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Query qe = ss.createQuery("from Student order by marks desc");
		List <Student> ls = new ArrayList();
		ls=qe.list();
		for(Student a : ls) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getCity()+" "+a.getMarks()+" "+a.getRating());
		}
	}

	public void ascend() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Query qe = ss.createQuery("from Student order by marks");
		List <Student> ls = new ArrayList();
		ls=qe.list();
		for(Student a : ls) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getCity()+" "+a.getMarks()+" "+a.getRating());
		}
		
		
	}

	public void displayByRating() {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Query qe = ss.createQuery("from Student order by rating desc");
		List <Student> ls = new ArrayList();
		ls=qe.list();
		for(Student a : ls) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getCity()+" "+a.getMarks()+" "+a.getRating());
		}
		
		
	}

	public void range() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		System.out.println("Enter the Range Starting value");
		int x1 = sc.nextInt();
		System.out.println("Enter the Range Ending value");
		int x2 = sc.nextInt();
		
		Query qe = ss.createQuery("from Student where marks between :start and :stop");
		qe.setParameter("start",x1 );
		qe.setParameter("stop",x2 );
		
		List <Student> ls = new ArrayList();
		ls=qe.list();
		for(Student a : ls) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getCity()+" "+a.getMarks()+" "+a.getRating());
		}
		
		
	}

	public void count() {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Query qe = ss.createQuery("select count(name),city from Student group by city");
		List <Object[]> ls = new ArrayList();
		ls=qe.list();
		System.out.println("count"+" "+"City");
		for(Object[] result : ls) {
			//Integer count = (Integer) result[0];
		    //String city = (String) result[1];
			
		    System.out.println( result[0] + ": " + result[1]);
		}
	}

	public void getAllData() {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Query qe = ss.createQuery("from Student");
		List <Student> list = new ArrayList();
		list=qe.list();
		
		for(Student tt:list) {
			System.out.println(tt.getId()+"    "+tt.getName()+"   "+tt.getCity()+"   "+tt.getMarks()+" "+tt.getRating());
		}
		ss.close();
		
	}

	public void updateById(int id) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Student te = ss.get(Student.class, id);
		te.setName("Vinay Kumar");
		ss.save(te);
		System.out.println("updated data successfully");
		tx.commit();
		ss.close();
		
	}

	public void searchById(int id) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Student te = ss.get(Student.class, id);
		System.out.println(te);
		ss.save(te);
		System.out.println("Searching data successfully");
		tx.commit();
		ss.close();
		
		
	}

	public void deleteById(int id) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		Student te = ss.get(Student.class, id);
		System.out.println(te);
		ss.delete(te);
		System.out.println("Deleting data successfully");
		tx.commit();
		ss.close();
		
	}
}


