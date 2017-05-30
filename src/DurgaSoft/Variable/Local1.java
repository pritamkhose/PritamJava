package DurgaSoft.Variable;

public class Local1 {
	
	
	public static void main(String[] args) {
		
		int[] A = {10,20,30,80,-100};
		final double pi = 3.14d;	 // it never change in program
		
		int total = 0;
		
		for (int x1 = 0; x1< A.length; x1++){
			total = total + A[x1];	
			// x1 variable is local variable only used in these block only
		}
		System.out.println(total);
		System.out.println(pi);
	}

}
