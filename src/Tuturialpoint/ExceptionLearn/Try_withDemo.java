package ExceptionLearn;

import java.io.*;

public class Try_withDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(FileReader fr=new FileReader("D://file1.txt")){
	         char [] a = new char[50];
	         fr.read(a); // reads the content to the array
	         for(char c : a)
	         System.out.print(c); //prints the characters one by one
	      
	      }catch(FileNotFoundException e){
	          e.printStackTrace();
	      }catch(IOException e){
	          e.printStackTrace();
	}}
}
