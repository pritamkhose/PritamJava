//Program of performing single task by multiple threads

package Multithreading;

class TestMultitasking2 implements Runnable{  
public void run(){  
System.out.println("task one");  
}  
  
public static void main(String args[]){  
	//passing annonymous object of TestMultitasking2 class  
Thread t1 =new Thread(new TestMultitasking2());

Thread t2 =new Thread(new TestMultitasking2());  
  
t1.start();  
t2.start();  
  
 }  
}  