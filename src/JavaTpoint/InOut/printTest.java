package InOut;

import java.io.*;

public class printTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter Char");
		int i=System.in.read();//returns ASCII code of 1st character
		System.out.println((char)i);//will print the character

		System.out.println("simple message");
		System.err.println("error message");


	}

}
