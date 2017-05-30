package JavaTpoint.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		
		 System.out.println("\nv is capacity = "+v.capacity());
		 System.out.println("\nv is size = "+v.size());
		 System.out.println("\nv is empty = "+v.isEmpty());
		
		
		 System.out.println("\nadding object in vector");
		  v.add("Ravi");  
		  v.add("Vijay");  
		  v.add("Ram");  
		  v.addElement("Ajay");  
		  v.addElement("Rahul");
		  v.add(5,"sham");
		 
		 System.out.println("\nv is empty = "+v.isEmpty());
		 
		 System.out.println("\nv is contain = "+v.contains("Rahul"));
		  
		 System.out.println("\nwhile loop -"); 
		  Iterator itr=v.iterator();//getting Iterator from arraylist to traverse elements  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  System.out.println("\nfor loop -"); 
		  // for loop
		  for(String obj:v)  
			    System.out.println(obj);  
			
		  System.out.println("\nAfter remove");
		  v.removeElement("sham");
		  v.remove("Ram");
		  v.removeElementAt(1);
		  
		  for(String obj:v)  
			    System.out.println(obj);
		  
		  System.out.println("\nFirst element = "+v.firstElement());
		  System.out.println("\nLast element = "+v.lastElement());
		  
		  v.set(2, "Meena");
		  System.out.println("\nindex element = "+v.get(2));
		  System.out.println("\nelement at = "+v.elementAt(1));
		  System.out.println("\nindex Of = "+v.indexOf("Meena"));
		   
		  
		  System.out.println("\nremaing element ");
		  for(String obj:v)  
			    System.out.println(obj);
		  
		  System.out.println("\ntraversing elements using Enumeration");
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  } 
		  
		  v.clear();
		  System.out.println("\nv is empty = "+v.isEmpty());
		  v.removeAllElements();
		  System.out.println("\nv is empty = "+v.isEmpty());
		  
			Vector vint=new Vector();  
			
			 System.out.println("\n-----\nvint is capacity = "+vint.capacity());
			 System.out.println("\nvint is size = "+vint.size());
			for(int i = 0; i < 15; i++)
				vint.add(i, i+10);
			
			Iterator itr1=vint.iterator();//getting Iterator from arraylist to traverse elements  
			  //traversing elements of ArrayList object  
			  while(itr1.hasNext()){  
			   System.out.println(itr1.next());  
			  }  
	}

}
