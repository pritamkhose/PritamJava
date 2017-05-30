package DurgaSoft.ClassesDeclare;

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overriding P = new Method_Overriding();
		P.m1();
		Method_Overriding P2 = new Method_Overriding();
		P2.m1();
		
		Child_Overriding C = new Child_Overriding();
		C.m1();
		Child_Overriding C2 = new Child_Overriding();
		C2.m1();
		
		
	}

	private void m1() {
		 System.out.println("Parent Method"); 
		
	}

}

 class Child_Overriding {

	 void m1() {
		 System.out.println("Child Method"); 
		
	}
 }