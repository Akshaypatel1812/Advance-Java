package MyJDBC;
import java.sql.*;

public class JDBCdemo {

	public static void main(String[] args) {
		try {
		String url = "jdbc:mysql://localhost/";
        String username = "root";
        String password = "Root@1812";

        // Load the JDBC driver
        
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        
        Statement stm=conn.createStatement();
        String query="create database Demo";
        stm.execute(query);
        System.out.println("connected Succesfully Jay Shree Ram");

        } catch (Exception e) {
            e.printStackTrace();
           
        }
	}

}
