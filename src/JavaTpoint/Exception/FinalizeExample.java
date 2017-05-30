package Exception;

public class FinalizeExample {

		public void finalize(){System.out.println("finalize called");}  
		
		public static void main(String[] args){  
		FinalizeExample f1=new FinalizeExample();  
		FinalizeExample f2=new FinalizeExample();  
		f1=null;  
		f2=null;  
		System.gc();  
		
		final int y=100;  
		
		try{  
			int x=300;  
			System.out.println(x+y);
			
		}catch(Exception e){System.out.println(e);}  
		finally{System.out.println("finally block is executed");}  
	}

}
