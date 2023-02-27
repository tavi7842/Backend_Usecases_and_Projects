package com.bitlabs.Spring_Demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitlabs.Entity.Address;
import com.bitlabs.Entity.Book;
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
        
        Address add = (Address) context.getBean("add");
        Book boo = (Book) context.getBean("boo");
        Student stu = (Student) context.getBean("stu");
        
        
        List<Object> list1 = new ArrayList();
        
        list1.add(add);
        list1.add(boo);
        list1.add(stu);
        
        for(Object o :list1) {
        	System.out.println(o);
        }
        
        //System.out.println(list1);
        
        
        
        
    }
}
