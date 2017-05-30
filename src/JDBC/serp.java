package JDBC;

import java.io.*;

public class serp {
	
public static void main (String [] args) throws Exception {
Emp eo=new Emp ();
eo.setEmpno (100);
eo.setEname ("KVR");
eo.setSal (10000.00f);
FileOutputStream fos=new FileOutputStream ("employee");
ObjectOutputStream oos=new ObjectOutputStream (fos);
oos.writeObject (eo);
System.out.println ("EMPLOYEE OBJECT SAVED SUCCESSFULLY...");
oos.close ();
fos.close ();
}
}