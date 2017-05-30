package Exception;

import java.io.IOException;

public class TestExceptionPropagation2{  
		  /*void m(){  
				throw new java.io.IOException("device error"); 
		  } */
		void m(){  
		    try {
				throw new java.io.IOException("device error");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//checked exception  
		  }
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
		  public static void main(String args[]){  
		   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		   obj.p();  
		   System.out.println("normal flow");  
		  }  
		}  