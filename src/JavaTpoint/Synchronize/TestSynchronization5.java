package Synchronize;
//Static synchronization by annonymous class In this example, we are using annonymous class to create the threads
class Table7{  
	  
	 synchronized static  void printTable7(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	public class TestSynchronization5 {  
	public static void main(String[] args) {  
	      
	    Thread t1=new Thread(){  
	        public void run(){  
	            Table7.printTable7(1);  
	        }  
	    };  
	      
	    Thread t2=new Thread(){  
	        public void run(){  
	            Table7.printTable7(10);  
	        }  
	    };  
	      
	    Thread t3=new Thread(){  
	        public void run(){  
	            Table7.printTable7(100);  
	        }  
	    };  
	      
	    Thread t4=new Thread(){  
	        public void run(){  
	            Table7.printTable7(1000);  
	        }  
	    };  
	    t1.start();  
	    t2.start();  
	    t3.start();  
	    t4.start();  
	      
	}  
	}  