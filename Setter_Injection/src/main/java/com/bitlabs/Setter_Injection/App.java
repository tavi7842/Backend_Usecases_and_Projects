package com.bitlabs.Setter_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        
        Student st = (Student) context.getBean("stu");
        Address ad = (Address) context.getBean("add");
        
        //System.out.println(st);
        System.out.println(ad);
    }
}
