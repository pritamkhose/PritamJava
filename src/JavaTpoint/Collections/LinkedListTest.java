package JavaTpoint.Collections;
import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		 LinkedList<String> al=new LinkedList<String>();  
		  
		 System.out.println("\nal is size = "+al.size());
		 System.out.println("\nal is empty = "+al.isEmpty());
		  
		 System.out.println("\nadding object in Linkedlist");
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ram");  
		  al.addLast("Ajay");  
		  al.addFirst("Rahul"); 
		  
		 System.out.println("\nal is empty = "+al.isEmpty());
		 
		 System.out.println("\nwhile loop -"); 
		  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  System.out.println("\nfor loop -"); 
		  // for loop
		  for(String obj:al)  
			    System.out.println(obj);  
			
		  System.out.println("\nAfter remove");
		  al.removeLast();  
		  al.removeFirst();
		  al.remove("Ram");
		  al.remove("sham");
		  for(String obj:al)  
			    System.out.println(obj);
		  
		  System.out.println("\nFirst element = "+al.getFirst());
		  System.out.println("\nLast element = "+al.getLast());
		  al.set(1, "Meena");
		  System.out.println("\nindex element = "+al.get(1));
	
		  for(String obj:al)  
			    System.out.println(obj);
	}

}
