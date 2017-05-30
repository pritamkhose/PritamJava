package myJava24;

public class Javamethod {
	
	public static void main(String[] args) {
		int i =5;
		int j =2;
		
		System.out.println("Method or Overloading Methods");
		int k = max(i, j);
		System.out.println("The maximum between "+ i +" and "+ j +" is "+ k);
		
		System.out.println("Void or Passing	Parameters by Values:");
		min(i, j);
		System.out.println("The minimum between "+ i +" and "+ j +" is "+ k);
		
	}
	
	protected void finalize()
	{
		System.out.println("final code");
	}
	
	/** Return the max between two numbers */
	public static int max(int num1,int num2){
		int result;
		if(num1 > num2)
		result = num1;
		else
		result = num2;
		return result;
		}
	
	public static void min(int num1,int num2){
		int result;
		if(num1 < num2)
		result = num1;
		else
		result = num2;
		//return result;
		}
		

}