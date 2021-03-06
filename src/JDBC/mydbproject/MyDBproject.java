
package mydbproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

  
public class MyDBproject {

   // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/mylogin";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "";
 
 //GUIjdbc gUIjdbc = new GUIjdbc();
 
 /*public String id = gUIjdbc.getId();
 public String fNname = gUIjdbc.getfNname();
 public String lNname = gUIjdbc.getlNname();
 public String city = gUIjdbc.getCity();
 public String email = gUIjdbc.getEmail();*/
 
 
 public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

   // id = GUIjdbc.id;

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
    
    String sql;
    
    String queryAccount = new String();
    /*queryAccount = "INSERT INTO login VALUES ('3', 'ram', 'kumar','ram@gmail.com','dehli');";
    stmt.executeUpdate(queryAccount);
    stmt.executeUpdate(queryAccount);
    queryAccount = "INSERT INTO login VALUES ('4', 'ram', 'kumar','ram@gmail.com','dehli');";
    stmt.executeUpdate(queryAccount);
    System.out.println(queryAccount); 
    queryAccount = "INSERT INTO login VALUES ('5', 'go', 'to','goto@gmail.com',null);";
    stmt.executeUpdate(queryAccount);
    System.out.println(queryAccount); 
    queryAccount = "DELETE FROM login WHERE id='3' OR id='4';";
    stmt.executeUpdate(queryAccount);
    System.out.println(queryAccount); 
   // System.out.println("1 entry delete"); */ 
    
    //queryAccount = (id+fName);
    //stmt.executeUpdate(queryAccount);
 //   System.out.println(id); 
    
    sql = "SELECT * FROM login;";
    ResultSet rs = stmt.executeQuery(sql);
    
   // System.out.println(GUIjdbc.printData);
    
    //STEP 5: Extract data from result set
    while(rs.next()){
   /*    //Retrieve by column name
    String id  = rs.getString("id");
    String first = rs.getString("first");
    String last = rs.getString("last");
    String email = rs.getString("first");
    String city = rs.getString("last");
    System.out.println(id +" " + first+ " "+ last+ " "+ email+ " "+ city); 
    
    */}
   
    System.out.println( rs); 
    
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
 System.out.println("Goodbye!");
 
 }  
}
