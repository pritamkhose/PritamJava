package myJava24;

public class javaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x =5, y=10, z = 5;
		System.out.println("x = "+x+"\ty ="+y+"\tz ="+z);
		
		System.out.println("\nValue");
		// Returns byte primitive data type
		System.out.println( x.byteValue());
		// Returns double primitive data type
		System.out.println(x.doubleValue());
		// Returns long primitive data type
		System.out.println( x.longValue());
		
		System.out.println("\ncompareTo");
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
		
		System.out.println("\nequals");
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(x));
		
		System.out.println("\nvalueOf");
		Integer d =Integer.valueOf(9);
		Double c =Double.valueOf(5);
		Float a =Float.valueOf("80");
		Integer b =Integer.valueOf("444",16);
		System.out.println(d);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\ntoString");
		System.out.println(x.toString());
		System.out.println(Integer.toString(12));
		
		System.out.println("\nparseInt abs ceil floor rint round");
		int l =Integer.parseInt("444",16);
		System.out.println(l);
		float f =-91.65f;
		System.out.println(Math.abs(f));
		System.out.println(Math.ceil(f));
		System.out.println(Math.floor(f));
		System.out.println(Math.rint(f));
		System.out.println(Math.round(f));
		
		System.out.println("\nMath fun");
		System.out.println(Math.min(12.123,12.456));
		System.out.println(Math.max(23.12,23.0));
		float p=0.92f;
		System.out.printf("log(%.3f) is %.3f%n", p,Math.log(p));
		double x1 =40;
		double y1 =1.2;
		System.out.printf("pow(%.3f, %.3f) is %.3f%n",x1, y1,Math.pow(x1, y1));
		System.out.printf("sqrt(%.3f) is %.3f%n", x1,Math.sqrt(x1));
		
			System.out.println("\nsine");
			double degrees =60.0;
			double radians =Math.toRadians(degrees);
			System.out.format("The sine of %.1f degrees is %.4f%n",degrees,Math.sin(radians));
			System.out.format("The cosine of %.1f degrees is %.4f%n",degrees,Math.cos(radians));
			System.out.format("The tan of %.1f degrees is %.4f%n",degrees,Math.tan(radians));
			System.out.format("The asine of %.1f degrees is %.4f%n",degrees,Math.asin(radians));
			System.out.format("The acos of %.1f degrees is %.4f%n",degrees,Math.acos(radians));
			System.out.format("The atan of %.1f degrees is %.4f%n",degrees,Math.atan(radians));
			//System.out.format("The atan2 of %.1f degrees is %.4f%n",degrees,Math.atan2(radians));
			
			System.out.println("\nangle");
			x =60;
			System.out.println(Math.toDegrees(x));
			System.out.println(Math.toRadians(x));
			System.out.println(Math.random());
			System.out.println(Math.random());
			
		System.out.println("\nCharacters");
		System.out.println("She said \"Hello!\" to me.");
		System.out.println(Character.isLetter('c'));
		System.out.println(Character.isLetter('5'));
		System.out.println(Character.isDigit('c'));
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isWhitespace('c'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('C'));
		System.out.println(Character.isUpperCase('\n'));
		System.out.println(Character.isUpperCase('\t'));
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isLowerCase('C'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.isLowerCase('\t'));
		
		System.out.println("");
		System.out.println(Character.toLowerCase('c'));
		System.out.println(Character.toLowerCase('C'));
		System.out.println(Character.toUpperCase('c'));
		System.out.println(Character.toUpperCase('C'));
		System.out.println(Character.toString('c'));
		System.out.println(Character.toString('C'));
	
	}

}
