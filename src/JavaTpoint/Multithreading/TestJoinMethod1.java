package JavaTpoint.Multithreading;

public class TestJoinMethod1 extends Thread{  
	
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e); }  
		  System.out.println(i + "\t"+Thread.currentThread().getName());  
		  //System.out.println(i + Thread.getAllStackTraces().toString());  
		  
		  }  
		 }  
	 
	 
		public static void main(String args[]){  
		 TestJoinMethod1 t1=new TestJoinMethod1();  
		 TestJoinMethod1 t2=new TestJoinMethod1();  
		 TestJoinMethod1 t3=new TestJoinMethod1();  
		 
		 t1.start();    // First 5 no
		 try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();   // First no t2 then t3 in loop 5 times
		 t3.start();  
		 }  
		}  

