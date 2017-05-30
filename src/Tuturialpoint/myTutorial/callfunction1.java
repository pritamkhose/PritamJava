package myTutorial;

/* File name : MammalInt.java */
public class callfunction1 implements Animal{

   public void eat(){
      System.out.println("Mammal eats");
   }

   public void travel(){
      System.out.println("Mammal travels");
   } 

   public int noOfLegs(){
	   System.out.println("end of line");
      return 0;
   }

   public static void main(String args[]){
	   callfunction1 m = new callfunction1();
      m.eat();
      m.travel();
   }
} 
/*
class Ups{
	System.out.println("end of line");
}*/