package tutorialspoint;

public class ExampleMinNumber {

	public static void main(String[] args) {
		  System.out.println("Method Call");
	      int a = 11;
	      int b = 6;
	      double c = 7.3;
	      double d = 9.4;
	      int result = minFunction(a, b);
	      System.out.println("Minimum Value = " + result);
	      
	      System.out.println("\nVoid Call");
	      methodRankPoints(255.7);
	      
	      System.out.println("\nPassing Parameters by Value");
			// Invoke the swap method
			swapFunction(a, b);
		
		  System.out.println("\nMethod Overriding");
			int result1 = minFunction(a, b);
			System.out.println("Minimum Value = " + result1);
		    // same function name with different parameters
		    double result2 = minFunction(c, d);
		    System.out.println("Minimum Value = " + result2);

	   }

	   /** returns the minimum of two numbers */
	// for double
	   public static double minFunction(double c, double d) {
		   double min;
	      if (c > d)
	         min = d;
	      else
	         min = c;

	      return min; 
	   }
	// for integer
	   public static int minFunction(int c, int d) {
		   int min;
	      if (c > d)
	         min = d;
	      else
	         min = c;

	      return min; 
	   }
	   
	   public static void methodRankPoints(double points) {
		      if (points >= 202.5) {
		         System.out.println("Rank:A1");
		      }
		      else if (points >= 122.4) {
		         System.out.println("Rank:A2");
		      }
		      else {
		         System.out.println("Rank:A3");
		      }
		   }
	   
	   public static void swapFunction(int a, int b) {
		   
		      System.out.println("Before swapping(Inside), a = " + a
		                           + " b = " + b);
		      // Swap n1 with n2
		      int c = a;
		      a = b;
		      b = c;

		      System.out.println("After swapping(Inside), a = " + a
		                           + " b = " + b);
		   }
}
