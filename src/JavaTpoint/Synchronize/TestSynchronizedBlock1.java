package Synchronize;

class Table4{  
	  
	 void printTable4(int n){  
	   synchronized(this){//synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  
	 }//end of the method  
	}  
	  
	class MyThread41 extends Thread{  
	Table4 t;  
	MyThread41(Table4 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable4(5);  
	}  
	  
	}  
	class MyThread42 extends Thread{  
	Table4 t;  
	MyThread42(Table4 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable4(100);  
	}  
	}  
	  
	public class TestSynchronizedBlock1{  
	public static void main(String args[]){  
	Table4 obj = new Table4();//only one object  
	MyThread41 t1=new MyThread41(obj);  
	MyThread42 t2=new MyThread42(obj);  
	t1.start();  
	t2.start();  
	}  
	}  