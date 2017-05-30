package javaVideoTut;
import java.util.Scanner;

public class s82exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		int a = 1;
		do{
		try{
			System.out.println("Enter 2 no. for division");
			int x = input1.nextInt();
			int y = input1.nextInt();
			// 89 65 >> 89 / 65 = 1
			System.out.println(x+" / "+y+" = "+(x/y));
			a= 2;
		}	catch(Exception e){
		System.out.println("invalid entry");
		}
		}while(a ==1);
	}
}
