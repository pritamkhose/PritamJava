package JavaTpoint.reflection;

class Simple5{}  
interface My{}  
  
class Test5{  
 public static void main(String args[]){  
  try{  
   Class c=Class.forName("Simple5");  
   System.out.println(c.isInterface());  
     
   Class c2=Class.forName("My");  
   System.out.println(c2.isInterface());  
    
  }catch(Exception e){System.out.println(e);}  
  
 }  
} 