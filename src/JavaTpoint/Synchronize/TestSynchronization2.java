package Synchronize;

//example of java synchronized method  
class Table2{  
synchronized void printTable2(int n){//synchronized method  
 for(int i=1;i<=5;i++){  
   System.out.println(n*i);  
   try{  
    Thread.sleep(400);  
   }catch(Exception e){System.out.println(e);}  
 }  

}  
}  

class MyThread21 extends Thread{  
Table2 t;  
MyThread21(Table2 t){  
this.t=t;  
}  
public void run(){  
t.printTable2(5);  
}  

}  
class MyThread22 extends Thread{  
Table2 t;  
MyThread22(Table2 t){  
this.t=t;  
}  
public void run(){  
t.printTable2(100);  
}  
}  

public class TestSynchronization2{  
public static void main(String args[]){  
Table2 obj = new Table2();//only one object  
MyThread21 t1=new MyThread21(obj);  
MyThread22 t2=new MyThread22(obj);  
t1.start();  
t2.start();  
}  
}  