import java.sql.*;

public class App {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		//register the driver class
		
		//we need to use for name method
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		//we need to get connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		} catch (Exception e) {

		e.printStackTrace();
		}
		if(con!=null) {
			System.out.println("Connected Successfully");
		}
		
		//create statement
		/*PreparedStatement pstmt = con.prepareStatement("insert into tarabai values(?,?,?)");
        pstmt.setInt(1,101);
        pstmt.setString(2,"Vinay");
        pstmt.setString(3,"Vinay@gmail.com");
        
        //Execute query
        
        int i =pstmt.executeUpdate();
        if(i>=1) {
        	System.out.println("Data Inserted Successfully");
        }
        /*Statement st = con.createStatement();
        String name = "Vinay Tanniru";
        int i=st.executeUpdate("update tarabai set name='"+name+"' where id='"+101+"'");
        if(i>1) {
        	System.out.println("Data Updated Successfully");
        }*/
		/*Statement st1 = con.createStatement();
        int i=st1.executeUpdate("delete from tarabai where id='"+101+"'");
        if(i>=1) {
        	System.out.println("Data deleted Successfully");
        }*/
		Statement st2 = con.createStatement();
		ResultSet s = st2.executeQuery("select * from tarabai");
		while(s.next()) {
			System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3));
		}
	}

}
