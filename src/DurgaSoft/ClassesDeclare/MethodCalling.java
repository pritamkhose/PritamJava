package DurgaSoft.ClassesDeclare;

public class MethodCalling {
	public static int max;
	
	public static void main(String[] args) {
	      int a = 11, b = 6;
	      int c = minFunction(a, b);
	      System.out.println("Minimum Value = " + c);
	      
	      maxFunction(a, b);
	      System.out.println("Maxmum Value = " + max);
	      
	      methodRankPoints(255.7);
	   }

	   /** returns the minimum of two numbers */
	// Passing Parameters by Value:
	   public static int minFunction(int n1, int n2) {
	      int min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min; 
	   }
	   
	   public static int maxFunction(int n1, int n2) {
		      if (n1 < n2)
		         max = n2;
		      else
		         max = n1;

		      return max; 
		   }
	   
	   // void keyword allows us to create methods which do not return a value
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
}
