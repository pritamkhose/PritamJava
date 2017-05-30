package DurgaSoft.OperatorAssignment;

import java.io.*;

public class OperatorTest {

	private static boolean falase;

	public static void main(String[] args) {
		
		int a =10, b = 20;
		//static boolean b1 = ture, b2 = falase;
		
		System.out.println("\n Equility Operator");
		System.out.println(a==b);
		System.out.println(a!=b);
		//System.out.println(a.equals(b));
		
		System.out.println("\n Relational Operator");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		System.out.println("\n Bitwise Operator");
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~a);		// inverse
		System.out.println(! falase); // complement
		
		System.out.println("\n Short cricuit Operator");
		System.out.println((a==b) && (a!=b));
		System.out.println((a==b) || (a!=b));
		
		System.out.println("\n Assignment Operator");
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a %= b);
		System.out.println(a &= b);
		System.out.println(a |= b);
		System.out.println(a ^= b);
		
		System.out.println("\n Shift Operator");
		System.out.println(a >> b);
		System.out.println(a >>> b);
		System.out.println(a << b);
		System.out.println(a >>= b);
		System.out.println(a >>>= b);
		System.out.println(a <<= b);
		
		System.out.println("\n inc/dec Operator");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		System.out.println("\n Conditional Operator");
		int z = (a>b)?40:50;
		System.out.println(z);
		
		System.out.println("\n operating precedence");
		int z1 = 0;
		System.out.println(++z1 + z1++ + z1++ + ++z1);

	}

}
