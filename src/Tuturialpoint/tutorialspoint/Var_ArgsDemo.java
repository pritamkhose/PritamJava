package tutorialspoint;

public class Var_ArgsDemo {

	public static void main(String[] args) {
		 // Call method with variable args  
		  printMax(34, 3, 3, 2, 56.5);
	      printMax(new double[]{1, 2, 3});
	      
	      SUMno(new int[]{10, 20, 30});
	}
	
	// for SUMno
	 public static void SUMno( int... x) {
		 int result =0,x1;
		   if (x.length == 0) {
		      System.out.println("No argument passed");
		      return;
		   }
		   else{
			   
			   for(x1=0;x1<x.length;x1++)
			   result= result + x[x1];
			//	   System.out.println(x1+" "+x.length);
		   }
		   System.out.printf("Sum of No. = %d",result);
			   
	 }
	// for printMax
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

}
