import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program2 {
	public static Connection con = null;

	public static String driver = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/demo";
	public static String user = "root";
	public static String password = "root";

	public static void readAllUser() {
		try {
			// STEP 1
			Class.forName(driver);

			// STEP 2
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Successfull");

			// STEP 3
			Statement st = con.createStatement();
			String squery = "SELECT * FROM TARABAI";
			ResultSet rs = st.executeQuery(squery);

			while (rs.next()) {
				String username = rs.getString("name");
				int userid = rs.getInt("Id");
				String email = rs.getString("email");
				System.out.println(userid + " " + username + " " + email);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertUser() {
		try {
			// STEP 3
			String squery1 = "INSERT INTO TARABAI(Id,name,email) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(squery1);
			ps.setInt(1, 105);
			ps.setString(2, "Aravind");
			ps.setString(3, "Aravind@gmail.com");

			ps.executeUpdate();
			System.out.println("Insert Successfull");
			con.close();
		} catch (Exception e) {

		}
	}

	public static void updateUser() {
		try {
			// STEP 3
			String squery1 = "UPDATE TARABAI SET name=? WHERE Id=?";
			PreparedStatement ps = con.prepareStatement(squery1);
			ps.setString(1, "Vinay");
			ps.setInt(2, 102);

			ps.executeUpdate();
			System.out.println("Update Successfull");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteUser() {
		try {
			String squery1 = "DELETE FROM TARABAI WHERE Id=?";
			PreparedStatement ps = con.prepareStatement(squery1);

			ps.setInt(1, 102);

			ps.executeUpdate();
			System.out.println("Delete Successfull");
			con.close();
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		insertUser();
		// updateUser();
		// deleteUser();
		readAllUser();
	}
}
