package myJDBC;

import java.sql.DriverManager;
import java.sql.*;
public class Main1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 // This will load the MySQL driver, each DB has its own driver
	      Class.forName("com.mysql.jdbc.Driver");
	      // Setup the connection with the DB
	      Connection con = DriverManager
	          .getConnection("jdbc:mysql://localhost"
	              , "root","root");

	      // PreparedStatements can use variables and are more efficient
	      PreparedStatement state = con
	          .prepareStatement("Select, from name)");
	      
	      ResultSet result= state.executeQuery();
	     
	      while (result.next())
	      System.out.println(result.getString(1)+ " "+ result.getString(2));
		  

	}

}
