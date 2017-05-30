package DurgaSoft.ClassesDeclare;


public class Method_Overriding2{

	   public static void main(String[] args) {
	      int a = 11;
	      int b = 6;
	      double c = 7.3;
	      double d = 9.4;
	      
	      // same function name with different parameters
	      int result1 = minFunction(a, b);
	      double result2 = minFunction(c, d);
	      byte result3 = (byte) minFunction(a, b);
	      
	      System.out.println("Minimum Value = " + result1);
	      System.out.println("Minimum Value = " + result2);
	      System.out.println("Minimum Value = " + result3);
	   }

	  // for integer
	   public static int minFunction(int n1, int n2) {
	      int min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min; 
	   }
	   // for double
	   public static double minFunction(double n1, double n2) {
	     double min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min; 
	   }
	   
	// for Byte
	   public static double minFunction(byte n1, byte n2) {
		   byte min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min; 
	   }
	}