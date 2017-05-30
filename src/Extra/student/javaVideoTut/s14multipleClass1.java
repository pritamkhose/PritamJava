package javaVideoTut;

import java.util.Scanner;

public class s14multipleClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		s14multipleClass2 c2obj = new s14multipleClass2();
		c2obj.msg(name);
		s14multipleClass3 c3obj = new s14multipleClass3();
		c3obj.msg();
	}

}
