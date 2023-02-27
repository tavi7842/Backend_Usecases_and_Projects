package com.bitlabs.My_First_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        //Need to create Congfiguration class
        Configuration cfg = new Configuration();
        
        //we need to call the xml file
        
        cfg.configure("hibernate.cfg.xml");
        
        //need to create the session Factory an object 
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        // To create a Session
        
        Session s = sf.openSession();
        
      //create object for pojo class
        Student12 st = new Student12();
        
        st.setId(101);
        st.setName("Vinay");
        st.setRoll_no(54);
        
        //We need to have Transaction
        
        Transaction tx = s.beginTransaction();
        
        s.save(st);
        
        tx.commit();
        
        s.close();
        
        
        
    }
}
