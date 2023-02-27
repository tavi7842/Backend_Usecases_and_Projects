package com.bitlabs.Annotate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bit.StudentMarks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session ss = sf.openSession();   
        StudentMarks sm = new StudentMarks();
        sm.setMarks(545);
        sm.setPercentage(91);
        
        StudentInfo si = new StudentInfo();
        si.setDeptName("CSE");
        si.setId(101);
        si.setName("Vinay");
        si.setStu(sm);
        
        Transaction tx = ss.beginTransaction();
        
        ss.save(si);
        tx.commit();
        ss.close();
        
        
        
    }
}
