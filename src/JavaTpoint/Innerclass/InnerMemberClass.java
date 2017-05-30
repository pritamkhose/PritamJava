package Innerclass;

class InnerMemberClass{  
 private int data=30; 
 
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 
 public static void main(String args[]){ 
	 
	 System.out.println("\nusing innerclass"); 
  InnerMemberClass obj=new InnerMemberClass();  
  InnerMemberClass.Inner in=obj.new Inner();  
  in.msg();  
  
  System.out.println("\nusing abstract / anonymous innerclass");
  Person p=new Person(){  
	  void eat(){
		  System.out.println("nice fruits");}  
	  };  
	  p.eat();  
 
  System.out.println("\nusing interface");
  Eatable e=new Eatable(){  
	   public void drink(){
		   System.out.println("nice drink");}  
		 };  
		 e.drink();  
 
  System.out.println("\n local Inner class");

 }  
}  

abstract class Person{  
	  abstract void eat();  
	} 

interface Eatable{  
	 void drink();  
	} 

