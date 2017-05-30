package DurgaSoft.Var_args;

public class Var_argsTest {

	public static void main(String[] args) {
	System.out.println("Traditional method");	
	// method overloading concept of m1
	m1();
	m1(10);
	m1(10,20);
	m1(10,20,30);
	m1(10,20,30,40);
	
	System.out.println("\nusing Var_args method");	
	var();
	var(10);
	var(10,20);
	var(10,20,30);
	var(10,20,30,40);
	}

	private static void var(int... i) 	// only these Syntax
	{	
		int total = 0;
		for(int ilen = 0; ilen < i.length; ilen++)
			total = total + i[ilen];
			System.out.println(total);	
	}
	
	private static void m1(int i, int j, int k, int l) {
		System.out.println(i+j+k+l);	
	}

	private static void m1(int i, int j, int k) {
		System.out.println(i+j+k);	
	}
	
	private static void m1(int i, int j) {
		System.out.println(i+j);	
	}

	private static void m1(int i) {
		System.out.println(i);	
	}
	
	private static void m1() {
		System.out.println("null");	
	}
}
