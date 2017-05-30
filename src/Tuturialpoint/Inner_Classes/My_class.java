package Inner_Classes;

public class My_class {

	class Outer_Demo{
		   int num;
		   //inner class
		   private class Inner_Demo{
		      public void print(){	   
		      System.out.println("This is an inner class");
		      }
		   }
		   //Accessing he inner class from the method within
		   void display_Inner(){
		      Inner_Demo inner = new Inner_Demo();
		      inner.print();
		   }
		}
	
	public static void main(String[] args) {
	/*	//Instantiating the outer class 
	      Outer_Demo outer=new Outer_Demo();
	      //Accessing the display_Inner() method.
	      outer.display_Inner();
	    //Instantiating the outer class
	      Outer_Demo outer1=new Outer_Demo();*/
	
		//Inner_Demo inner=new Inner_Demo();
		//inner.display_Inner();
	      
	}
}
