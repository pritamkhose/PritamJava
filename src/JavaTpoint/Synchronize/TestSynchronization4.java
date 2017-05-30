package Synchronize;
//no synchronization, synchronized keyword on the static method to perform static synchronization
class Table{  
	  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class MyThread51 extends Thread{  
	public void run(){  
	Table.printTable(1);  
	}  
	}  
	  
	class MyThread52 extends Thread{  
	public void run(){  
	Table.printTable(10);  
	}  
	}  
	  
	class MyThread53 extends Thread{  
	public void run(){  
	Table.printTable(100);  
	}  
	}  
	  
	  
	  
	  
	class MyThread54 extends Thread{  
	public void run(){  
	Table.printTable(1000);  
	}  
	}  
	  
	public class TestSynchronization4{  
	public static void main(String t[]){  
	MyThread51 t1=new MyThread51();  
	MyThread52 t2=new MyThread52();  
	MyThread53 t3=new MyThread53();  
	MyThread54 t4=new MyThread54();  
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	}  
	}  