package javatpoint;


class Student2{  
 int rollno;  
 String name;  
  
 void insertRecord(int r, String n){  //method  
  rollno=r;  
  name=n;  
 }  
  
 void displayInformation(){System.out.println(rollno+" "+name);}//method  
  
 public static void main(String args[]){  
  Student2 s1=new Student2();  
  Student2 s2=new Student2();  
  s1.displayInformation();  
  s1.insertRecord(11,"Karan");  
  s2.insertRecord(22,"Aryan");  
  
  s1.displayInformation();  
  s2.displayInformation();  
  
 }  
}  