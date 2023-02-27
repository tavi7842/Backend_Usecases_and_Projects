package com.bitlabs.ManytoManRelation;

import java.util.ArrayList;
import java.util.List;

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
        
        SessionFactory sf= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Question que = new Question();
        
        que.setId(101);
        que.setQuestion("What is java Language");
        
        Question que1 = new Question();
        
        que1.setId(102);
        que1.setQuestion("What is oops Language");
        
        Answer ans = new Answer();
        Answer ans1 = new Answer();
        
        ans.setId(201);
        ans.setAnswer("Java is high level Language");
        
       
        
        ans.setId(202);
        ans.setAnswer("Java is oops Language");
        
        List <Question> listQ = new ArrayList();
        List <Answer> listA = new ArrayList();
        
        listQ.add(que1);
        listQ.add(que);
        
        listA.add(ans1);
        listA.add(ans);
        
        que.setAns(listA);
        ans.setQue(listQ);
        
        ss.save(que);
        ss.save(que1);
        ss.save(ans);
        ss.save(ans1);

        tx.commit();
        ss.close();
    }
}
