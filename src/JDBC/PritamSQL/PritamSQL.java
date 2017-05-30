package PritamSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class PritamSQL {

	   // JDBC driver name and database URL
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost:3306/mylogin";

	 //  Database credentials
	 static final String USER = "root";
	 static final String PASS = "";
	 
	 Connection conn = null;
	 Statement stmt = null;
	 public String queryAccount = new String();
	 public String sql;
	 
	 public void ConnectDatabase() throws Exception {
		    try {
		    	
		    	//STEP 2: Register JDBC driver
		        Class.forName("com.mysql.jdbc.Driver");

		        //STEP 3: Open a connection
		        System.out.println("Display database...");
		        conn = DriverManager.getConnection(DB_URL,USER,PASS);


		        //STEP 4: Execute a query
		        System.out.println("Creating statement...");
		        stmt = conn.createStatement();
		        
		        
		        sql = "SELECT * FROM login;";
		        ResultSet rs = stmt.executeQuery(sql);
		        
		        
		        //STEP 5: Extract data from result set
		        while(rs.next()){
		           //Retrieve by column name
		        String id  = rs.getString("id");
		        String first = rs.getString("first");
		        String last = rs.getString("last");
		        String email = rs.getString("email");
		        String city = rs.getString("city");
		        System.out.println(id +" " + first+ " "+ last+ " "+ email+ " "+ city); 
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
		     System.out.println("end of statement!");

		  }

	 
	 public void InsetTable(String s1,String s2,String s3,String s4,String s5) throws SQLException {
		 //String queryAccount = new String();

		 try {
			 
			 	//STEP 2: Register JDBC driver
		        Class.forName("com.mysql.jdbc.Driver");

		        //STEP 3: Open a connection
		        System.out.println("Inset to database...");
		        conn = DriverManager.getConnection(DB_URL,USER,PASS);


		        //STEP 4: Execute a query
		        System.out.println("Creating statement...");
		        stmt = conn.createStatement();
		        
			 	sql = "SELECT * FROM login;";
		        ResultSet rs = stmt.executeQuery(sql);
		        
		        //queryAccount = "INSERT INTO login VALUES ('4', 'ram', 'kumar','ram@gmail.com','dehli');";
		        queryAccount = "INSERT INTO login VALUES ('"+s1+"', '"+s2+"', '"+s3+"','"+s4+"','"+s5+"');";
		        
		        stmt.executeUpdate(queryAccount);
		        System.out.println(queryAccount); 
		        
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

}

	 public void DeleteTable(int delID) throws SQLException {
		 try {
			 
			 	//STEP 2: Register JDBC driver
		        Class.forName("com.mysql.jdbc.Driver");

		        //STEP 3: Open a connection
		        System.out.println("Delete from database...");
		        conn = DriverManager.getConnection(DB_URL,USER,PASS);


		        //STEP 4: Execute a query
		        System.out.println("Creating statement...");
		        stmt = conn.createStatement();
		        
			 	sql = "SELECT * FROM login;";
		        ResultSet rs = stmt.executeQuery(sql);
		        
		        queryAccount = "DELETE FROM login WHERE id='23' OR id='"+delID+"';";
		        stmt.executeUpdate(queryAccount);
		        System.out.println(queryAccount); 
		        
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
	}
	 
	 public void UpdateTable(String s1,String s2,String s3,String s4) throws SQLException {
		 try {
			 
			 	//STEP 2: Register JDBC driver
		        Class.forName("com.mysql.jdbc.Driver");

		        //STEP 3: Open a connection
		        System.out.println("Update to database...");
		        conn = DriverManager.getConnection(DB_URL,USER,PASS);


		        //STEP 4: Execute a query
		        System.out.println("Creating statement...");
		        stmt = conn.createStatement();
		        
			 	sql = "SELECT * FROM login;";
		        ResultSet rs = stmt.executeQuery(sql);
		        
		        queryAccount = "UPDATE `login` SET "+ s3 +" = '"+s4+"' WHERE `login`."+s1+" ='"+s2+"';";

		        /*UPDATE `potluck` 
		        SET 
		        `confirmed` = 'N' 
		        WHERE `potluck`.`name` ='Sandy' OR `potluck`.`name` ='TOM';*/
		        
		        stmt.executeUpdate(queryAccount);
		        System.out.println(queryAccount); 
		        
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
	}
	
}

