package Exception;

public class tryCatchFinally{  
	 public static void main(String args[]){  
		 try{  
			   int data=25/0;  
			   System.out.println(data);  //exception occurs and  handled.
			  }  
			  catch(ArithmeticException e){System.out.println(e);}  //exception occurs and not handled.
			  finally{System.out.println("finally block is always executed");}  
			  System.out.println("rest of the code...");  
			  } 
	} 
