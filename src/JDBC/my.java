package JDBC;

import java.sql.*;
class InsertRec
{
public static void main (String [] args)
{
try
{
Driver d=new Sun.jdbc.odbc.JdbcOdbcDriver ();
DriverManager.registerDriver (d);
System.out.println ("DRIVERS LOADED...");
Connection con=DriverManager.getConnection ("com.mysql.jdbc.Driver","root","");
System.out.println ("CONNECTION ESTABLISHED...");
Statement st=con.createStatement ();
int i=st.executeUpdate ("insert into student values (10,'suman',60.87);");
System.out.println (i+" ROWS SELECTED...");
con.close ();
}
catch (Exception e)
{
System.out.println ("DRIVER CLASS NOT FOUND...");
}
}
};