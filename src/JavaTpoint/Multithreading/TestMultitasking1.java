//Program of performing single task by multiple threads

package JavaTpoint.Multithreading;

public class TestMultitasking1 extends Thread{  
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
		 }  
		}  