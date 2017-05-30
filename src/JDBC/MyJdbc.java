import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbc {
	 // JDBC driver name and database URL
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://localhost:3306/emp";
	 static final String tableName = "emp";
	 //  Database credentials
	 static final String USER = "root";
	 static final String PASS = "";
	 
	 static Connection conn = null;
	 static Statement stmt = null;
	 static ResultSet rs = null;
	 static ResultSetMetaData rsmd = null;
	 
	public static void main(String[] args) {
		 try{
		 
			 ConnectDatabase();

		    //STEP 4: Execute a query
		    stmt = conn.createStatement();
		  	
		//    stmt.executeQuery("use EMP;");
		//   stmt.executeQuery("show tables;");
		   
		   
		    PrintTable();
		   
		 //   PrintProperties();
		   
		//   InsertData();

		 //  DeleteData();
		   
		//   UpdateData();
		    
		 //   BatchData();
		  
		    PrintTableSort();
		    
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

	}

	private static void BatchData() throws SQLException {
		// TODO Auto-generated method stub
		
		conn.setAutoCommit (false);
		Statement st=conn.createStatement ();
		st.addBatch ("INSERT INTO Employees VALUES (300, 48, 'sama', 'ryan');");
		st.addBatch ("delete from Employees where age=30");
		//st.addBatch ("update student set sname='java' where sno=2");
		int res []=st.executeBatch ();
		for (int i=0; i<res.length; i++)
		{
		System.out.println ("NUMBER OF ROWS EFFECTED : "+res [i]);
		}
		conn.commit ();
		conn.rollback ();
	}

	private static void UpdateData() throws SQLException {
		// TODO Auto-generated method stub
		String s3 = "id",s4 = "id";
		String s1 = "200",s2 = "100";
		String queryAccount = "UPDATE `Employees` SET "+ s3 +" = '"+s1+"' WHERE `Employees`."+s4+" ='"+s2+"';";
		stmt.executeUpdate(queryAccount);
		System.out.println("\nUpdate in Row No = "+ s2);

	}

	private static void DeleteData() throws SQLException {
		// TODO Auto-generated method stub
		int rowNo = 100;
	//	rs.absolute (rowNo );
	//	rs.deleteRow ();
		String queryAccount = "DELETE FROM Employees WHERE id = 100";
	    stmt.executeUpdate(queryAccount);
		System.out.println("\nDelete Row No = "+ rowNo);
		
	}

	private static void InsertData() throws SQLException {
		// TODO Auto-generated method stub
		String queryAccount = new String();
		queryAccount = "INSERT INTO Employees VALUES (100, 18, 'Zara', 'Ali');";
	    stmt.executeUpdate(queryAccount);
		System.out.println("INSERT New Entry = "+queryAccount);
	}

	private static void PrintTable() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("\nPrint Table...");
	    ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
	    rsmd=rs.getMetaData ();
	    for (int i=1; i<=rsmd.getColumnCount (); i++)
	    {
	    System.out.print (rsmd.getColumnName (i)+"\t");
	    }
	    System.out.println();
	    while(rs.next())
	    //	System.out.println("ID: " + rs.getInt("id") +", Age: " + rs.getInt("age")+", First: " + rs.getString("first")+", Last: " + rs.getString("last"));
	   //  	System.out.println(rs.getInt("id") +"\t" + rs.getInt("age")+"\t" + rs.getString("first")+"\t" + rs.getString("last"));
	    {
	    for (int j=1; j<=rsmd.getColumnCount (); j++)
	    {
	    System.out.print (rs.getString (j)+"\t");
	    } System.out.print ("\n");
	    }
	}

	private static void PrintTableSort() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("\nPrint Table...");
	    ResultSet rs = stmt.executeQuery("	SELECT DISTINCT * FROM Employees ORDER BY age ASC;");
	    rsmd=rs.getMetaData ();
	    for (int i=1; i<=rsmd.getColumnCount (); i++)
	    {
	    System.out.print (rsmd.getColumnName (i)+"\t");
	    }
	    System.out.println();
	    while(rs.next())
	    {
	    for (int j=1; j<=rsmd.getColumnCount (); j++)
	    {
	    System.out.print (rs.getString (j)+"\t");
	    } System.out.print ("\n");
	    }
	}
	


	private static void PrintProperties() throws SQLException {
		// TODO Auto-generated method stub 
		System.out.println ("\nPrint Properties");
		 System.out.println ("Coloumn Name - ");
	    for (int i=1; i<=rsmd.getColumnCount (); i++)
	    {
	    System.out.print (rsmd.getColumnName (i)+" ");
	    }

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
		
	}

	public static void ConnectDatabase() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");

	    //STEP 3: Open a connection
	    System.out.println("Connecting to database...");
	    conn = DriverManager.getConnection(DB_URL,USER,PASS);
		
	}
	
}
