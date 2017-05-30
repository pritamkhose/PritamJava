package ExceptionLearn;

public class ExcepTest {

	public static void main(String[] args) {
		      int a[] = new int[1]; // 2 is length
		      try{
		    	 System.out.println("Access element 1 :" + a[0]);
		    	 System.out.println("Access element 2 :" + a[1]);
		    	 System.out.println("Access element 3 :" + a[2]);
		    	 
		         System.out.println("Access element 4 :" + a[3]);
		      }catch(ArrayIndexOutOfBoundsException e){
		         System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
		      }catch(Exception e){
			     System.out.println("Exception thrown  :" + e);
			  }
		      finally{
		         a[0] = 6;
		         System.out.println("First element value: " +a[0]);
		         System.out.println("The finally statement is executed");
		      }
	}

}
