package MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentJDBC {

	public void createDatabase() {
		
		try {
			String url = "jdbc:mysql://localhost/";
	        String username = "root";
	        String password = "Root@1812";

	        // Load the JDBC driver
	        
//	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, username, password);
	        
	        Statement stm=conn.createStatement();
	        String query="create database Student";           // databases always creates in small letters
	        stm.execute(query);
	        System.out.println("connected Succesfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	           
	        }
	}

	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost/Student";
	        String username = "root";
	        String password = "Root@1812";

	        // Load the JDBC driver
	        
//	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, username, password);
	        
	        Statement stm=conn.createStatement();
	        String query="create table student (Sid int(3),Sname varchar(200),Semail varchar(200))";           // databases always creates in small letters
	        stm.execute(query);
	        System.out.println("Table Created Succesfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	           
	        }
		
	}

	public void insertDatabase() {
		try {
			String url = "jdbc:mysql://localhost/Student";
	        String username = "root";
	        String password = "Root@1812";

	        // Load the JDBC driver
	        
//	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, username, password);
	        
	        Statement stm=conn.createStatement();
	        String query="insert into Student VALUES (1,'Akshay','akshay@gmail.com')";           // databases always creates in small letters
	        stm.execute(query);
	        System.out.println("Inserted data Succesfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	           
	        }
		
	}

	public void insertDatabase2() {
		try {
			String url = "jdbc:mysql://localhost/Student";
	        String username = "root";
	        String password = "Root@1812";

	        // Load the JDBC driver
	        
//	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, username, password);
	        String query="insert into Student VALUES (?,?,?)";  
	        PreparedStatement pstm=conn.prepareStatement(query);
	        pstm.setInt(1, 75);
	        pstm.setString(2, "Vedant");
	        pstm.setString(3, "vedant@gmail.com");
	        pstm.execute();
	        System.out.println("Inserted 2nd data Succesfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	           
	        }
		
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost/Student";
	        String username = "root";
	        String password = "Root@1812";

	        // Load the JDBC driver
	        
//	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection(url, username, password);
	        
	        Statement stm=conn.createStatement();
	        String query="select * from Student";           
	        ResultSet rs=stm.executeQuery(query);
	        //here when we execute query will get our success message but we can't see the data on our console
	        while(rs.next()) {                                  //it gives all Inserts
	        	System.out.print("id="+rs.getInt(1)+"  ");
	        	System.out.print("id="+rs.getString(2)+"  ");
	        	System.out.println("id="+rs.getString(3)+"  ");
	        }
	        
	        System.out.println("data selected Succesfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	           
	        }
		
	}

}
