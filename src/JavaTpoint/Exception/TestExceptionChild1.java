package Exception;
// subclass overridden method declares subclass exception
class Parent{  
  void msg(){System.out.println("parent");}  
}  
  
public class TestExceptionChild1 extends Parent{  
  void msg()throws ArithmeticException{  
    System.out.println("child");  
  }  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild1();  
   p.msg(); 
   
   Parent p1=new TestExceptionChild1();  
   try{  
   p1.msg();  
   }catch(Exception e){}  
  }  
}  