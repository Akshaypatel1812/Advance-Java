package Employee;
import java.sql.*;
import java.util.*;
public class data {
      private static int Eid;
      private static String Ename;
      private static String Email;
      private static int Esalary;
      
      data(int Eid,String Ename, String Email, int Esalary) {
    	  this.Eid=Eid;
    	  this.Ename=Ename;
    	  this.Email=Email;
    	  this.Esalary=Esalary;
      }
      
      public int getId() {
    	  return Eid;
      }
      public String getName() {
    	  return Ename;
      }
      public String getEmail() {
    	  return Email;
      }
      public int getSalary() {
    	  return Esalary;
      }
}
