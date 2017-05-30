package Java_Interfaces;

public class MammalInt implements Animal{

	   public void eat(){
	      System.out.println("Mammal eats");
	   }

	   public void travel(){
	      System.out.println("Mammal travels");
	   } 

	   public void walk(){
		      System.out.println("Mammal walk");
		   } 
	   
	   public int noOfLegs(){
	      return 0;
	   }

	   public static void main(String args[]){
	      MammalInt m = new MammalInt();
	      m.eat();
	      m.travel();
	      m.walk();  
	      // must be written in interface file & method
	   }
}
