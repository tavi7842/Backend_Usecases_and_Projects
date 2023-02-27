package com.bitlabs.Hibernate_Test;

import com.bitlabs.Dao.Dao_Impl;
import com.bitlabs.Dao.Dao_Interface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Dao_Interface da = new Dao_Impl();
        
        //da.insert();
        
        da.viewAllData();
        
        //da.updateName(1);
        
        //da.delete(1);
    }
}
