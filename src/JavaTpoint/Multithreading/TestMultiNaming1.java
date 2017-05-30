package Multithreading;

public class TestMultiNaming1 extends Thread{  
	  public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
		  TestMultiNaming1 t0=new TestMultiNaming1();  
		  TestMultiNaming1 t1=new TestMultiNaming1();  
		  System.out.println("Name of t1:"+t0.getName());  
		  System.out.println("Name of t2:"+t1.getName());  
		   
		  t0.start();  
		  t1.start();  
		  
		  t0.setName("Sonoo Jaiswal");  
		  System.out.println("After changing name of t0:"+t0.getName());  
		 }  
		}  