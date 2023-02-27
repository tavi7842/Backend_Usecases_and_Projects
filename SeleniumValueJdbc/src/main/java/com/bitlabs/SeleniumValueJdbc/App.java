package com.bitlabs.SeleniumValueJdbc;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Variable var = context.getBean("variable",Variable.class);
        
        var.display();
        
        try {
			var.jdbcConnection();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
}
