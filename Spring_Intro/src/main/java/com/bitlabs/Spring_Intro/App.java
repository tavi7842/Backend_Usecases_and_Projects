package com.bitlabs.Spring_Intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext context=new ClassPathXmlApplicationContext("configure.xml");
       
       Employee emp =  context.getBean("emp",Employee.class);
       Employee emp1 = (Employee) context.getBean("emp1");
       Employee emp2 = (Employee) context.getBean("emp2");
    
       
       System.out.println(emp);
       System.out.println(emp1);
       System.out.println(emp2);
     
    }
}
