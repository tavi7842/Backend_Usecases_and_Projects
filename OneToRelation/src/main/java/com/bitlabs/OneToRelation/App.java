package com.bitlabs.OneToRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.Entity.Answer;
import com.bitlabs.Entity.Question;

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
        Transaction tx = ss.beginTransaction();
        Answer ans = new Answer();
        ans.setAnswer("Java is a high Programming language");
        
        
        Question que = new Question();
        que.setQuestion("What is java");
        que.setAns(ans);
        ans.setQue(que);
        
        ss.save(que);
        ss.save(ans); 
        tx.commit();
        ss.close();
    }
}
