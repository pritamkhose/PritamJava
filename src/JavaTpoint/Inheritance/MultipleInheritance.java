package Inheritance;

public class MultipleInheritance1 extends x  {
	int k;
	
	MultipleInheritance1(int p,int q,int r){
		i=p;
		j=q;
		k=r;
		System.out.println("MultipleInheritance Constructor ");	
	}
	
	void show() {
		super.show();
		System.out.println(k);	
	}
	
 public static void main(String[] args) {
	 MultipleInheritance1 obj = new MultipleInheritance1(10,20,30);
	 obj.show();
 }
}

 
 class x extends w {
	int j ;
	x(){
		System.out.println("x Constructor ");	
	}
	 void show() {
		super.show();
		System.out.println("j="+j);
	}
	
 class w {
	int i ;
	
	w(){
		System.out.println("w Constructor ");	
	}
	public void show() {
		System.out.println("i="+i);
	}
}