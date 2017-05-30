package JavaTpoint.Collections;

import java.util.*;

public class HashtableTest {

	public static void main(String[] args) {
		  
		  System.out.println("\nHashMap");
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  

		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul"); 
		  
		  for(Map.Entry m:hm.entrySet())  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  
	}
}
