package hospital_details;

import java.sql.*;
/*import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

public class DaoImpl implements Dao_Interface {
	Connection con = null;

	public DaoImpl() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inserting_Patient_Details(Patient_Details p) {
		try {
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO Patient_Details VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, null);
			ps.setString(2, p.getName());
			ps.setString(3, p.getGender());
			ps.setInt(4, p.getAge());
			ps.setString(5, p.getAddress());
			ps.setString(6, p.getCity());
			ps.setString(7, p.getD_o_a());
			ps.setString(8, p.getG_name());
			ps.setString(9, p.getG_address());
			ps.setLong(10, p.getAd_num());
			ps.setLong(11, p.getC_num());
			ps.setLong(12, p.getGc_num());
			ps.setString(13, p.getRecovered());

			int i = ps.executeUpdate();

			if (i > 0) {
				System.out.println("Insertion Successfull");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void listing_Patient_Details() {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Patient_Details");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getInt(4)
						+" "+rs.getString(5)+ " "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)
						+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "
					+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void printing_Based_On_Id(int id) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Patient_Details WHERE id='"+id+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getInt(4)
				+" "+rs.getString(5)+ " "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)
				+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "
			+rs.getLong(12)+" "+rs.getString(13));
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void printing_Based_On_City(String city) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Patient_Details WHERE city='" + city + "'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getInt(4)
				+" "+rs.getString(5)+ " "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)
				+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "
			+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void printing_Based_On_Age(int age,int age1) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select*from patientinfo where age between '"+age+"' and '"+age1+"' ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getInt(4)
				+" "+rs.getString(5)+ " "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)
				+" "+rs.getString(9)+" "+rs.getLong(10)+" "+rs.getLong(11)+" "
			+rs.getLong(12)+" "+rs.getString(13));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void update_Recovery_Status(int id) {
		try {
			Statement ptst = con.createStatement();
			int i = ptst.executeUpdate("UPDATE Patient_Details SET recovered = 'YES' WHERE id='" + id + "'");
			if (i > 0) {
				System.out.println("Updation Successfull");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete_Patient_Details(int id) {
		try {
			Statement ptst = con.createStatement();
			int i = ptst.executeUpdate("DELETE FROM Patient_Details WHERE recovered = 'YES' AND id='" + id + "'");
			if (i > 0) {
				System.out.println("Deletion Successfull");
			}else {
				System.out.println("Deletion Unsuccessfull - Patient Not Recovered");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
