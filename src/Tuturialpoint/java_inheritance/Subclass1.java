package java_inheritance;

public class Subclass1 extends Superclass {
	//constructor
	Subclass1(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

		   public static void main(String argd[]){
		      Subclass1 s = new Subclass1(24);
		      s.getAge();
		   }
	}

class Superclass{
	   
	   int age;

	   Superclass(int age){
	      this.age = age; 		 
	   }

	   public void getAge(){
	      System.out.println("age in super class is: " +age);
	   }

	}