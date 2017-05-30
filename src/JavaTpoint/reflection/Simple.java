package JavaTpoint.reflection;

class Test{}  

public class Simple{  
 public static void main(String args[]) throws ClassNotFoundException{  
  Class c=Class.forName("Simple");  
  System.out.println(c.getName());  
 }  
}  