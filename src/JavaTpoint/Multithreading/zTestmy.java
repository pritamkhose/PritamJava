package JavaTpoint.Multithreading;

public class zTestmy {  //extends Thread
	 
	 public void run(){  
		   System.out.println("task one");  
		 }
	 
		 public static void main(String args[]){  
		  TestMultitasking1 t1=new TestMultitasking1();  
		  TestMultitasking1 t2=new TestMultitasking1();  
		  TestMultitasking1 t3=new TestMultitasking1();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  
		  t1.stop();  
		  t2.destroy(); 
		  t3.start();
		 }  
		}  