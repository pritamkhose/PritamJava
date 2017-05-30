package myJava24;

public class Arith_Test {

	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		int c =25, d =25;
		System.out.println("a = "+a+" b = "+b+" c = "+c+" d = "+d);
		System.out.println("\nAritmematic operator");
		System.out.println("a + b = "+(a + b));
		System.out.println("a - b = "+(a - b));
		System.out.println("a * b = "+(a * b));
		System.out.println("b / a = "+(b / a));
		System.out.println("b % a = "+(b % a));
		System.out.println("c % a = "+(c % a));
		System.out.println("a++ = "+(a++));
		System.out.println("b-- = "+(a--));
		// Check the difference in d++ and ++d
		System.out.println("d++ = "+(d++));
		System.out.println("++d = "+(++d));
		
		System.out.println("\nRelational operator");
		System.out.println("a == b = "+(a == b));
		System.out.println("a != b = "+(a != b));
		System.out.println("a > b = "+(a > b));
		System.out.println("a < b = "+(a < b));
		System.out.println("b >= a = "+(b >= a));
		System.out.println("b <= a = "+(b <= a));
		
		System.out.println("\nBitwise operator");
		c = a & b;/* 12 = 0000 1100 */
		System.out.println("a & b = "+ c );
		c = a | b;/* 61 = 0011 1101 */
		System.out.println("a | b = "+ c );
		c = a ^ b;/* 49 = 0011 0001 */
		System.out.println("a ^ b = "+ c );
		c =~a;/*-61 = 1100 0011 */
		System.out.println("~a = "+ c );
		c = a <<2;/* 240 = 1111 0000 */
		System.out.println("a << 2 = "+ c );
		c = a >>2;/* 215 = 1111 */
		System.out.println("a >> 2 = "+ c );
		c = a >>>2;/* 215 = 0000 1111 */
		System.out.println("a >>> 2 = "+ c );
		
		System.out.println("\nLogical operator");
		boolean x =true;
		boolean y =false;
		System.out.println("x && y = "+(x&&y));
		System.out.println("x || y = "+(x||y));
		System.out.println("!(x && y) = "+!(x && y));
		
		System.out.println("\nAssignment operator");
		c = a + b;
		System.out.println("c = a + b = "+ c );
		c += a ;
		System.out.println("c += a = "+ c );
		c -= a ;
		System.out.println("c -= a = "+ c );
		c *= a ;
		System.out.println("c *= a = "+ c );
		a =10;
		c =15;
		c /= a ;
		System.out.println("c /= a = "+ c );
		a =10;
		c =15;
		c %= a ;
		System.out.println("c %= a = "+ c );
		c <<=2;
		System.out.println("c <<= 2 = "+ c );
		c >>=2;
		System.out.println("c >>= 2 = "+ c );
		c >>=2;
		System.out.println("c >>= a = "+ c );
		c &= a ;
		System.out.println("c &= 2 = "+ c );
		c ^= a ;
		System.out.println("c ^= a = "+ c );
		c |= a ;
		System.out.println("c |= a = "+ c );
		
		System.out.println("\nCondtional operator");
		a =10;
		b =(a ==1)?20:30;
		System.out.println("Value of b is : "+ b );
		b =(a ==10)?20:30;
		System.out.println("Value of b is : "+ b );
		
		/*System.out.println("\ninstanceof operator");
		classVehicle{}
		public class CarextendsVehicle{
		public static void main(String args[]){
		Vehicle a =newCar();
		boolean result = a instanceofCar;
		System.out.println(result);*/
		}
}
