package DurgaSoft.Var_args;

public class VarargsDemo {

	   public static void main(String args[]) {
	      // Call method with variable args  
		  printMax(34, 3, 3, 2, 56.5);
	      printMax(new double[]{1, 2, 3});
	      printMax(new float[]{1.2f, 2.3f, 3.7f});
	      
	     
	   }

	   // var_arg method
	   public static void printMax( double... numbers) {
	   if (numbers.length == 0) {
	      System.out.println("No argument passed");
	      return;
	   }

	   double result = numbers[0];

	   for (int i = 1; i <  numbers.length; i++)
	      if (numbers[i] >  result)
	      result = numbers[i];
	      System.out.println("The max value is " + result);
	   }
	   
	 /*  public static void finalize()
	   {
	      // finalization code here
		   System.out.println("finalization code");
	   }*/
	   
	   
	   // method over riding float over double
	   public static void printMax( float... numbers) {
		   if (numbers.length == 0) {
		      System.out.println("No argument passed");
		      return;
		   }

		   float result = numbers[0];

		   for (int i = 1; i <  numbers.length; i++)
		      if (numbers[i] >  result)
		      result = numbers[i];
		      System.out.println("The max value is " + result);
		   }
	}