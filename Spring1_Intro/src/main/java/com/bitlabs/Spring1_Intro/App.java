package com.bitlabs.Spring1_Intro;

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
        
        
        Student student = context.getBean("student",Student.class);
        Student student1 = context.getBean("student1",Student.class);
        Student student2 = context.getBean("student2",Student.class);
        
        student.display();
        student1.display();
        student2.display();
    }
}
