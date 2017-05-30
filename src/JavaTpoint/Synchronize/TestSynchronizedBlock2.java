package Synchronize;

//Program of synchronized block by using annonymous class
class Table5{  

void printTable5(int n){  
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

public class TestSynchronizedBlock2{  
public static void main(String args[]){  
final Table5 obj = new Table5();//only one object  

Thread t1=new Thread(){  
public void run(){  
obj.printTable5(5);  
}  
};  
Thread t2=new Thread(){  
public void run(){  
obj.printTable5(100);  
}  
};  

t1.start();  
t2.start();  
}  
}   