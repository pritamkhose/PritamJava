package DurgaSoft.ClassesDeclare;

public class ClassBasicIO {

	final static float pi = 3.14f;
	static double C;	// Class variables
	private double a,b;
	
	public static void ClassBasicIO(double a, double b){
	      // This constructor has one parameter, name.
		//this.AnsOut(a, b);
		//this.setA(a);
		//this.setB(b);
		System.out.println("This constructor of main method"); 
		System.out.println(a+" "+b); 
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.22;		// Instance variables 
		double b =-2.42;
		
		ClassBasicIO(a,b);
		
		AnsOut(a,b);
		System.out.println(C); 
	}
	
	static void AnsOut(Double a, Double b){
		int i = 10;			// Local variables:
		C = a + b+ i+pi;
	}

	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}

