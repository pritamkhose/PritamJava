package JavaTpoint.Collections;

import java.util.*;  
import java.io.*;  

public class SortTest {

	public static void main(String[] args) {
		  
		  System.out.println("\nEnter Data");
		  ArrayList al=new ArrayList();  
		  al.add(Integer.valueOf(201));  
		  al.add(Integer.valueOf(101));  
		  al.add(230);
		  al.add(30);
		  //internally will be converted into objects as Integer.valueOf(230)  
		  		  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		  System.out.println(itr.next());  
		  }  
		  
		  System.out.println("\nAfterSort");
		  Collections.sort(al);
		  Iterator itr1=al.iterator();  
		  while(itr1.hasNext()){  
		  System.out.println(itr1.next());  
		  } 
		  
		  System.out.println("\nmax = "+Collections.max(al));
		  System.out.println("\nmin = "+Collections.min(al));
		  
		  
		  ArrayList stdal=new ArrayList();  
		  stdal.add(new Student(101,"Vijay",23));  
		  stdal.add(new Student(106,"Ajay",27));  
		  stdal.add(new Student(105,"Jai",21));  
		    
		  Collections.sort(stdal);  
		  Iterator stditr=stdal.iterator();  
		  while(stditr.hasNext()){  
		  Student1 st=(Student1)stditr.next();  
		  System.out.println(st.rollno+""+st.name+""+st.age);  
		  }
	}
}
