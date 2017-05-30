package Multithreading;

public class TestCallRun2 {  //extends Thread
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		    try{
		    	Thread.sleep(500);
		    	}catch(InterruptedException e){
		    		System.out.println(e);
		    	}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  TestCallRun2 t1=new TestCallRun2();  
		  TestCallRun2 t2=new TestCallRun2();  
		   
		  t1.run();  // First 5 no of t1 
		  t2.run();  // then t2 in 5 no of t1 
		 }  
		}  