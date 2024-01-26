package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.*;

public class employeeDAO {
     public static void CreateData(data d){
    	 try { 
 	        
 	        String query=Query.insert;           // databases always creates in small letters
 	        PreparedStatement pstm=DBdata.connect().prepareStatement(query);
	        pstm.setInt(1, d.getId());
	        pstm.setString(2, d.getName());
	        pstm.setString(3, d.getEmail());
	        pstm.setInt(4, d.getSalary());
	        pstm.execute();
 	        System.out.println("Inserted data Succesfully");

 	        } catch (Exception e) {
 	            e.printStackTrace();
 	           
 	        }
     }
     
     public static void ReadData(){
    	 try { 
    		 Statement stm=DBdata.connect().createStatement();
 	        String query=Query.read;           
 	        ResultSet rs=stm.executeQuery(query);
 	        //here when we execute query will get our success message but we can't see the data on our console
 	        while(rs.next()) {                                  //it gives all Inserts
 	        	System.out.print("id="+rs.getInt(1)+"  ");
 	        	System.out.print("name="+rs.getString(2)+"  ");
 	        	System.out.println("mailId="+rs.getString(3)+"  ");
 	        	System.out.println("salary="+rs.getString(4)+"  ");
 	        }
 	        
 	        System.out.println("data selected Succesfully");

 	        } catch (Exception e) {
 	            e.printStackTrace();
 	           
 	        }
     }
}
