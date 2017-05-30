package JavaTpoint.Collections;

class Student1 implements Comparable{  
int rollno;  
String name;  
int age;  
Student1(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Object obj){  
Student1 st=(Student1)obj;  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
  
}  