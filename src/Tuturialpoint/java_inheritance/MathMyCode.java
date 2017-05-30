package java_inheritance;

public class MathMyCode {
	
	public static int a = 10, b = 20, c = 30, d = 40;
	public static int result = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = Sum(a,b);
		int r2 = Sum(c,d);
		result = Mul(r1,r2);
		System.out.println("ANS = "+result);
	}

	private static int Mul(int m1, int m2) {
		System.out.println("MUL = "+ (m1*m2));
		return m1 * m2;
		
	}

	private static int Sum(int a1, int a2) {
		System.out.println("AND = "+ (a1+a2));
		return a1 + a2;
	}
}
