package JavaTpoint.Collections;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		  
		  System.out.println("\nal is empty = "+al.isEmpty());
		  System.out.println("\nal is size = "+al.size());
			
		  System.out.println("\nadding object in arraylist");
		  al.add("Ravi");
		  al.add("Vijay");  
		  al.add("Ram");  
		  al.add("Ajay");  
		  
		  System.out.println("\nwhile loop -"); 
		  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  ArrayList<String> alcopy=new ArrayList<String>();//creating arraylist
		 // alcopy.addAll(al);
		  alcopy.addAll(al);
		  System.out.println("\nfor loop -"); 
		  // for loop
		  for(String obj:alcopy)  
			    System.out.println(obj);  
		  System.out.println("\nalcopy = al : "+alcopy.equals(al));
		  
		  //String alArray[];
		  //alArray.toArray(alcopy);
		  //al.toArray(alArray);
		  //System.out.println("\nalcopy convert to array : "+alArray);
		  // 
		  System.out.println("\nal has code : "+al.hashCode());
		  
		  System.out.println("\naddAll(Collection c) method");
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Sonoo");  
		  al2.add("Hanumat");
		  al2.add("Ravi");
		    
		  al.addAll(al2);    
		  
		  Iterator itr2=al.iterator();  
		  while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }  

		  System.out.println("\nremoving the elements of al2...");   
		  al.removeAll(al2); 
		  
		  Iterator itr3=al.iterator(); 
		  while(itr3.hasNext()){  
		   System.out.println(itr3.next());  
		  }  
		  
		  System.out.println("\nal is empty = "+al.isEmpty());
		   //Clear(al2); 
		  System.out.println("\nal2 is empty = "+al2.isEmpty());
		  System.out.println("\ncontains 1 = "+al2.contains("Ram"));
		  System.out.println("\ncontains ALL = "+al2.containsAll(al));
		  
		  
		  System.out.println("\nretaining the elements of al2...");  
		  al.add("Ravi");  
		  al.add("Hanumat"); 
		  al.retainAll(al2);  
		  		   
		  Iterator itr4=al.iterator();  
		  while(itr4.hasNext()){  
		   System.out.println(itr4.next());  
		  }  
		  
		  System.out.println("\nRemove 1 elements of al...");  
		  al.remove("Ravi");
		  Iterator itr5=al.iterator();  
		  while(itr5.hasNext()){  
		   System.out.println(itr5.next()); 
		  } 

		  
		  al.removeAll(al2);
		  System.out.println("\nAL is empty = "+al.isEmpty());
	   	  al.clear();
		  System.out.println("\nAL is empty = "+al.isEmpty());
		  
		  //*************************************************
		  System.out.println("\nCreating user-defined class objects "); 
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		      
		  ArrayList<Student> z1=new ArrayList<Student>();//creating arraylist  
		  z1.add(s1);//adding Student class object  
		  z1.add(s2);  
		  z1.add(s3);  
		  
		  //for(Student obj1:al1)  
		  //System.out.println(obj1);
		  
		  Iterator zitr1=z1.iterator();  
		  //traversing elements of ArrayList object  
		  while(zitr1.hasNext()){  
		    Student st=(Student)zitr1.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		  
	}
}

/*
class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	} */
 
