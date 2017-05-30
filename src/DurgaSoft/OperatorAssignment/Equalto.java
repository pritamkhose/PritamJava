package DurgaSoft.OperatorAssignment;

import java.io.*;

public class Equalto {

	public static void main(String[] args) {
		System.out.println("Object Operator");
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		System.out.println("\n Equility Operator");
		System.out.println(s1==s2);
		System.out.println(s1!=s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("\n i");
		System.out.println(t1 instanceof Thread);
		System.out.println(t1 instanceof Object);
		System.out.println(t1 instanceof Runnable);
		
		System.out.println(t1!=t2);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
	}

}
