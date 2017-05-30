package JavaTpoint.Collections;

import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		  
		  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		System.out.println("\nhead:"+queue.element());  
		System.out.println("\npeek:"+queue.peek()); 
		  
		queue.remove();  
		queue.poll();  
		  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  	  
	}
}
