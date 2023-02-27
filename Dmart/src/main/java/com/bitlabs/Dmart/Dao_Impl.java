package com.bitlabs.Dmart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao_Impl implements Dao_Interface {
	Connection con=null;
	
	public Dao_Impl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	
	public void insert(Product_Info p) {
		
		try {
			PreparedStatement pst = con.prepareStatement("INSERT INTO Product_Info VALUES(?,?,?,?,?)");
			
			pst.setString(1, null);
			pst.setString(2,p.getP_name());
			pst.setInt(3, p.getP_qty());
			pst.setInt(4, p.getP_price());
			pst.setString(5, p.getAvailability());
			
			int i = pst.executeUpdate();
			
			if(i>=1) {
				System.out.println("Insert Successfull");
			}
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	public void viewProducts() {
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Product_Info");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}


	public void searchProduct(int pid) {
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Product_Info WHERE pid='"+pid+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void updateProduct(int pid) {
		try {
			Statement st = con.createStatement();
			int i = st.executeUpdate("UPDATE Product_Info SET Availability = Not_Available WHERE pid='"+pid+"'");
			if(i>=1) {
				System.out.println("Update Successfull");
			}
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void deleteRecord(int pid) {
		
		try {
			Statement st = con.createStatement();
			int i = st.executeUpdate("DELETE FROM Product_Info WHERE pid='"+pid+"'");
			if(i>=1) {
				System.out.println("Delete Successfull");
			}
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
