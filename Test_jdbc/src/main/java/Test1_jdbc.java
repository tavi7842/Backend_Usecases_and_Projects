import java.sql.Connection;
import java.sql.DriverManager;

public class Test1_jdbc {

	public static void main(String[] args) {
		System.out.println("Hello JDBC");
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "root";
		String password = "root";
		
		try {
			//STEP 1
			Class.forName(driver);
			
			//STEP 2
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("Connection Successfull");
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
