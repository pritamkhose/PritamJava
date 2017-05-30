package Inheritance;

public class SimpleInheritance {
	SimpleInheritance(){
		System.out.println("SimpleInheritance Constructor ");	
	}
 public static void main ( String[] args) {
	 Derived obj = new Derived(10,20,30);
	 obj.show();
	 obj.show2();
 }
}

 class Derived extends Base {
	int i,j,k;
	public Derived (int x, int y, int z) {
		i=x;
		j=y;
		k=z;
	}
	Derived(){
		System.out.println("Derived Constructor ");	
	}
	public void show() {
		System.out.println("k="+k);	
	}
}
 
 class Base {
	int i,j ;
	
	Base(){
		System.out.println("Base Constructor ");	
		//super.show();
	}
	public void show2() {
		System.out.println("i="+i);	
		System.out.println("j="+j);	
		
	}
}