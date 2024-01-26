package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;

public class DBdata {
    private static Connection conn = null;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost/company";
            String username = "root";
            String password = "Root@1812";

            // Load the JDBC driver

//            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}



      
