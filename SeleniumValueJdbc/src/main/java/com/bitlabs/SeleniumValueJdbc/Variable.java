package com.bitlabs.SeleniumValueJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class Variable {
	
	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.driver}")
	private String driver;
	
	private Connection con = null;
	
	public void display() {
		System.out.println(username+"  "+password+"  "+url+"  "+driver);
	}

	public void jdbcConnection() throws SQLException {
		
		Connection con=null;
		//register the driver class
		
		//we need to use for name method
		try {
		Class.forName(driver);
		
		//we need to get connection
		con = DriverManager.getConnection(url, username, password);
		
		} catch (Exception e) {

		e.printStackTrace();
		}
		if(con!=null) {
			System.out.println("Connected Successfully");
		}
	}
}
