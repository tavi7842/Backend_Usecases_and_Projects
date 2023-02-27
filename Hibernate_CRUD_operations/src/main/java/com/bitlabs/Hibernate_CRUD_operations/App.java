package com.bitlabs.Hibernate_CRUD_operations;

import java.util.Scanner;

import com.bitlabs.Tarabai_Dao.Tarabai_Dao_Interface;
import com.bitlabs.Tarabai_Dao.Tarabai_Dao_layer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int option =0;
        System.out.println( "Hello World!" );
        Tarabai_Dao_Interface td = new Tarabai_Dao_layer();
        Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("Enter 1 for Inserting Data");
        	System.out.println("Enter 2 for Viewing Data");
        	System.out.println("Enter 3 for Updating Data");
        	System.out.println("Enter 4 for Searching Data");
        	System.out.println("Enter 5 for Deleting Data");
        	option=sc.nextInt();
        	
        	switch(option) {
        	case 1: 
        		td.insert();
        	    break;
        	case 2: 
        		td.getAllData();
        	    break;
        	case 3: 
        		td.updateById(1);
        	    break;
        	case 4: 
        		td.searchById(1);
        	    break;
        	case 5: 
        		td.deleteById(1);
        	    break;
        	}
        	
        }while(option!=0);
        System.out.println("Thank you");
    }
}
