package JDBC;


import JDBC.Emp;
import java.io.*;

public class dserp
{
public static void main (String [] args) throws Exception
{
Emp eo1=new Emp ();
FileInputStream fis=new FileInputStream ("employee");
ObjectInputStream ois=new ObjectInputStream (fis);
Object obj=ois.readObject ();
eo1= (Emp) obj;
System.out.println ("EMP NO : "+eo1.getEmpno ());
System.out.println ("EMP NAME : "+eo1.getEname ());
System.out.println ("EMP SALARY : "+eo1.getSal ());
ois.close ();
fis.close ();
}
};