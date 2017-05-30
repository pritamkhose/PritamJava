package Conversion;

public class javaConversion {

	public static void main(String args[]){  
		String s="-200";  
		System.out.println(Integer.parseInt(s));  
		System.out.println(Long.parseLong(s));
		System.out.println(Double.parseDouble(s));
		System.out.println(Float.parseFloat(s));
		System.out.println("");
		
		int i = 10; double d = 10.3; float f = 20.6f;
		System.out.println(String.valueOf(i)); 
		System.out.println(String.valueOf(d)); 
		System.out.println(String.valueOf(f)); 
		
		System.out.println("");
		System.out.println(s+100);//200100 because + is string concatenation operator  
		System.out.println(i+100);//300 because + is binary plus operator  
	
		
		String s1=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s1+10);//200100 because + is string concatenation operator  
		
		
		/* DecimalToBinary decimalToBinary = new DecimalToBinary();
	      String binary = javaConversion.toBinary(10);
	       System.out.println("The binary representation is " + binary);
		 */
	}	

	
public String toBinary(int n) {
    if (n == 0) {
        return "0";
    }
    String binary = "";
    while (n > 0) {
        int rem = n % 2;
        binary = rem + binary;
        n = n / 2;
    }
    return binary;
}
}