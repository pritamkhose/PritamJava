package DurgaSoft.ClassesDeclare;

public class constructorEx {

	public static void main(String[] args) {
		  MyClass t1 = new MyClass( 10 );
	      MyClass t2 = new MyClass( 20 );
	      System.out.println(t1.x + " " + t2.x);
	   }

	}

/* 
A constructor initializes an object when it is created. 
It has the same name as its class and is syntactically similar to a method. 
However, constructors have no explicit return type. 
*/
	//A simple constructor.
	class MyClass {
		int x;
	
	// Following is the constructor
		MyClass(int i ) {
		   x = i;
		}
}
