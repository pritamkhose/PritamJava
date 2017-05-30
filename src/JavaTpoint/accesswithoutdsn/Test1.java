//Example to Connect Java Application with access with DSN

//To connect java application with type1 driver, create DSN first, here we are assuming your dsn name is mydsn.

package accesswithoutdsn; 

import java.sql.*;  
class Test1{  
public static void main(String ar[]){  
 try{  
   String url="jdbc:odbc:mydsn";  
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
   Connection c=DriverManager.getConnection(url);  
   Statement st=c.createStatement();  
   ResultSet rs=st.executeQuery("select * from login");  
    
   while(rs.next()){  
    System.out.println(rs.getString(1));  
   }  
  
}catch(Exception ee){System.out.println(ee);}  
  
}}  