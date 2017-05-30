package JDBC;
 
 

import java.io.FileInputStream;
//STEP 1. Import required packages
import java.sql.*;
import java.util.Properties;

public class FirstExample_2 {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/emp";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "";
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
	 
	/* FileInputStream fis=new FileInputStream ("rbfdb.prop");
	 Properties p=new Properties ();
	 p.load (fis);
	 String dname= (String) p.get ("Dname");
	 String url= (String) p.get ("URL");
	 String username= (String) p.get ("Uname");
	 String password= (String) p.get ("Pwd");
	 String tablename= (String) p.get ("Tablename");
	 System.out.println(dname+url+username+password+tablename);*/
	 
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
    String sql;
 //   sql = "SELECT id, first, last, age FROM Employees";
  //  sql = "Show Databases";
   stmt.executeQuery("use EMP;");
    sql = "show tables;";
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next())
        System.out.println(rs.getInt("Tables_in_emp"));
    
 // PRINTING COLUMN NAME
    ResultSetMetaData rsmd=rs.getMetaData ();
    for (int i=1; i<=rsmd.getColumnCount (); i++)
    {
    System.out.print (rsmd.getColumnName (i)+" ");
    }
    System.out.println ("");
    
   /* //STEP 5: Extract data from result set
    while(rs.next()){
       //Retrieve by column name
       int id  = rs.getInt("id");
       int age = rs.getInt("age");
       String first = rs.getString("first");
       String last = rs.getString("last");

       //Display values
       System.out.println("ID: " + id+", Age: " + age+", First: " + first+", Last: " + last);
    }*/
   
   
     
    System.out.println ("\n\nUNIVERSAL DATABASE DETAILS");
    DatabaseMetaData dmd=conn.getMetaData ();
    System.out.println ("DATABASE NAME : "+dmd.getDatabaseProductName ());
    System.out.println ("DATABASE VERSION : "+dmd.getDatabaseProductVersion ());
    System.out.println ("NAME OF THE DRIVER : "+dmd.getDriverName ());
    System.out.println ("VERSION OF THE DRIVER : "+dmd.getDriverVersion ());
    System.out.println ("MAJOR VERSION OF DRIVER : "+dmd.getDriverMajorVersion ());
    System.out.println ("MINOR VERSION OF DRIVER : "+dmd.getDriverMinorVersion ());
    
    System.out.println ("\nNUMBER OF COLUMNS : "+rsmd.getColumnCount ());
    for (int i=1; i<=rsmd.getColumnCount (); i++)
    {
    System.out.println ("NAME OF THE COLUMN : "+rsmd.getColumnName (i));
    System.out.println ("TYPE OF THE COLUMN : "+rsmd.getColumnType (i));
    }
    
    //STEP 6: Clean-up environment
    rs.close();
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("\nGoodbye!");
}//end main
}//end FirstExample


/* My SQL Database crate =
Enter password: **** root
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 20
Server version: 5.6.28-log MySQL Community Server (GPL)

Copyright (c) 2000, 2015, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.


mysql> create database emp;
Query OK, 1 row affected (0.04 sec)

mysql> use EMP;
Database changed

mysql> create table Employees
    -> (id int not null,
    -> age int not null,
    -> first varchar (255),
    -> last varchar (255)
    -> );
Query OK, 0 rows affected (0.34 sec)

mysql> INSERT INTO Employees VALUES (100, 18, 'Zara', 'Ali');
Query OK, 1 row affected (0.11 sec)

mysql> INSERT INTO Employees VALUES (101, 25, 'Mahnaz', 'Fatma');
Query OK, 1 row affected (0.09 sec)

mysql> INSERT INTO Employees VALUES (102, 30, 'Zaid', 'Khan');
Query OK, 1 row affected (0.05 sec)

mysql> INSERT INTO Employees VALUES (103, 28, 'Sumit', 'Mittal');
Query OK, 1 row affected (0.05 sec)

mysql> show tables;
+---------------+
| Tables_in_emp |
+---------------+
| employees     |
+---------------+
1 row in set (0.02 sec)

mysql> SELECT id, first, last, age FROM Employees;
+-----+--------+--------+-----+
| id  | first  | last   | age |
+-----+--------+--------+-----+
| 100 | Zara   | Ali    |  18 |
| 101 | Mahnaz | Fatma  |  25 |
| 102 | Zaid   | Khan   |  30 |
| 103 | Sumit  | Mittal |  28 |
+-----+--------+--------+-----+
4 rows in set (0.01 sec)

mysql>

mysql> DESCRIBE Employees;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int(11)      | NO   |     | NULL    |       |
| age   | int(11)      | NO   |     | NULL    |       |
| first | varchar(255) | YES  |     | NULL    |       |
| last  | varchar(255) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
4 rows in set (0.26 sec)


mysql script

create database emp;
use EMP;
create table Employees(id int not null,age int not null,first varchar (255),last varchar (255));
INSERT INTO Employees VALUES (100, 18, 'Zara', 'Ali');
INSERT INTO Employees VALUES (101, 25, 'Mahnaz', 'Fatma');
INSERT INTO Employees VALUES (102, 30, 'Zaid', 'Khan');
INSERT INTO Employees VALUES (103, 28, 'Sumit', 'Mittal');
show tables;
DESCRIBE Employees;
SELECT id, first, last, age FROM Employees;

*/