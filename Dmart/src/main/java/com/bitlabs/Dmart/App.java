package com.bitlabs.Dmart;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 String p_name,availability;
    	 int p_qty,pid,p_price;
    	
        Dao_Interface da = new Dao_Impl();
        Product_Info p = new Product_Info();
        Scanner sc = new Scanner(System.in);
        char ch=0;
        
        do {
        	
        System.out.println("\n 1.Insert_Products"+"\n 2.View_All_Products"+" "+"\n 3.Search_Product"+" "+"\n 4.Update_Record"+" "+"\n 5.Delete_Product_Record");
        System.out.println("Choose your option");
        int option = sc.nextInt();
        switch(option) {
        case 1:
        	System.out.println("Enter the Product name");
        	p_name = sc.next();
        	p.setP_name(p_name);
        	System.out.println("Enter the Product qty");
        	p_qty = sc.nextInt();
        	p.setP_qty(p_qty);
        	System.out.println("Enter the Product Price");
        	p_price = sc.nextInt();
        	p.setP_price(p_price);
        	p.setAvailability("Available");
        	da.insert(p);
        	
        	break;
        case 2:
        	da.viewProducts();
        	break;
        case 3:
        	System.out.println("Enter the Product id");
        	pid = sc.nextInt();
        	da.searchProduct(pid);
        	break;      
        case 4:
        	System.out.println("Enter the Product id");
        	int pid2 = sc.nextInt();
        	da.updateProduct(pid2);
        	break;
        case 5:
        	System.out.println("Enter the Product id");
        	int pid1 = sc.nextInt();
        	da.deleteRecord(pid1);
        	break;
        	
        }
        System.out.println("Do you wish to contunue (Y/N)");
        ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        
        System.out.println("Thank You");
    }
}
