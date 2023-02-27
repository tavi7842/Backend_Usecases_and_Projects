package com.bitlabs.Product_Hibernate;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
       SessionFactory sf = cfg.buildSessionFactory();
    
        
        Product_pojo pp = new Product_pojo();
        FileInputStream fs = new FileInputStream("src/main/java/welcome.jpg");
        byte [] data = new byte[fs.available()];
        fs.read(data);
        pp.setImage(data);
        pp.setId(1);
        
        pp.setName("Philips");
        pp.setQty(10);
        pp.setStock(15);
        pp.setOdate(new Date());
        
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(pp);
        tx.commit();
        s.close();
        
        
        
        }
}
