/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pritam
 */
import java.sql.*;  
class MysqlCon{  
    
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/emp";
 //  Database credentials
 static final String USER = "root";
 static final String PASS = "";
 
public static void main(String args[]){  
 //Connection conn = null;
 Statement stmt = null;

try{
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    Connection con = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM Employees");
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
    con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
