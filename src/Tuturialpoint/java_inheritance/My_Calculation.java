package java_inheritance;

class Calculation{ 
	//overloading - a & b, c & d
	//over riding - c & a, 
	
	
	   int z;
		// always use public ... never private
	   public void addition(int x, int y){			//a
	      z = x+y;
	      System.out.println("The sum :"+z);
	   }
		
	   public void Substraction(int x,int y){		//b
	      z = x-y;
	      System.out.println("The difference :"+z);
	   }
	   

	}

	public class My_Calculation extends Calculation{    
	
		// private can be use
	   private void multiplication(int x, int y){	//c	
	      z = x*y;
	      System.out.println("The product :"+z);
	   }
	   
	   public void division(int x,int y){			//d
		      System.out.println("The division :"+x/y);
		   }
	   
		
	   public static void main(String args[]){
	      int a = 20, b = 10;
	      My_Calculation demo = new My_Calculation();
	      demo.addition(a, b);
	      demo.Substraction(a, b);
	      demo.multiplication(a, b);      
	      demo.division(a, b); 
	   }

	}
