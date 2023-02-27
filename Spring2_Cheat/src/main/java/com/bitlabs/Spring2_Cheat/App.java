package com.bitlabs.Spring2_Cheat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
        
        Student studentobj = context.getBean("student",Student.class);
        
        studentobj.display();
    }
}
