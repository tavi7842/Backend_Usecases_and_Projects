package com.bitlabs.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.Entity.Ambiguity;
import com.bitlabs.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
//        
//        Student student= (Student) context.getBean("stu");
//        
//        System.out.println(student);
        
        ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
        
        Ambiguity ambiguity = (Ambiguity) context.getBean("ambiguity1");
        
        System.out.println(ambiguity);
        
        ambiguity.show();
        
        
        
    }
}
