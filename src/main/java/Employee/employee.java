package Employee;

import java.util.*;
import java.sql.*;

public class employee {

	public static void main(String[] args) {
		while(true) {
		 System.out.println("Employee Database");
		 System.out.println("Enter your choice 1.Create 2.Read 3.Update 4.Delete:");
		 Scanner sc=new Scanner(System.in);
		 int Choice=sc.nextInt();
		 
		 if(Choice<1 || Choice>4) break;
		 switch(Choice) {
		 case 1: System.out.println("Enter Your EmpId,Name,Email,Salary in Order:");
				 int Eid = sc.nextInt();
		         sc.nextLine(); // Consume the newline character
		         String Ename = sc.nextLine();
		         String Email = sc.nextLine();
		         int Esalary = sc.nextInt();
		         
		         data d=new data(Eid,Ename,Email,Esalary);
		         employeeDAO.CreateData(d);
		         break;
		         
		 case 2: employeeDAO.ReadData();
		         break;
		         
		 default:
             System.out.println("Invalid Choice");
             break;
	   }
	 }
		
		
	}

}
