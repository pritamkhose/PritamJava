package Multithreading;

public class Multi1 extends Thread {

	/*public static void main(String[] args) {
		Multi t1=new Multi();  
		t1.start(); 

	}

	public void run(){  
		System.out.println("thread is running...");  
		}  */
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		Multi1 m1=new Multi1();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
}
   