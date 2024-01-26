package Employee;
import java.util.*;
import java.sql.*;

public class Query {

	static String insert="insert into employee (Eid,Ename,Email,Esalary) values (?,?,?,?)";
    static String read="select * from employee";
}
