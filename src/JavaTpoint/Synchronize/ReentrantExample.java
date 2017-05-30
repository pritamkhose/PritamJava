package Synchronize;

//reuse the same monitor for different synchronized methods if method is called from the method.

public class ReentrantExample{  
public static void main(String args[]){  
final ReentrantExample re=new ReentrantExample();  
  
Thread t1=new Thread(){  
public void run(){  
re.m();//calling method of Reentrant class  
}  
};  
t1.start();  
}


	public synchronized void m() {  
	    n();  
	    
	    System.out.println("this is m() method");  
	    }  
	    public synchronized void n() {  
	    System.out.println("this is n() method");  
	    } 
	
} 