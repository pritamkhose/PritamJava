package JavaTpoint.Collections;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		  
		  System.out.println("\nHashMap");
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  

		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  for(Map.Entry m:hm.entrySet())  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  
		  
		  System.out.println("\nLinkedHashMap");
		  LinkedHashMap<Integer,String> hm1=new LinkedHashMap<Integer,String>();  
			
		  hm1.put(100,"Amit");  
		  hm1.put(101,"Vijay");  
		  hm1.put(102,"Rahul");  
		  for(Map.Entry m:hm1.entrySet())  
		   System.out.println(m.getKey()+" "+m.getValue()); 


		  System.out.println("\nTreeMap");
		  TreeMap<Integer,String> hm2=new TreeMap<Integer,String>();  
			
		  hm2.put(100,"Amit");  
		  hm2.put(101,"Vijay");  
		  hm2.put(102,"Rahul");  
		  for(Map.Entry m:hm2.entrySet())  
		   System.out.println(m.getKey()+" "+m.getValue()); 
		  
		  System.out.println("\nputAll method");
		  HashMap<Integer,String> hm3=new HashMap<Integer,String>(); 
		  hm3.putAll(hm1);  
		  for(Map.Entry m:hm3.entrySet())  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		  
		  System.out.println("\nremove object");
		  hm3.remove(101,"Vijay");  
		  hm3.remove(100);   
		  for(Map.Entry m:hm3.entrySet())  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		  
		  hm3.put(101,"Ram");  
		  System.out.println("\nData get : "+hm3.get(101)); 
		  
		  System.out.println("\nreamaing object");
		  for(Map.Entry m:hm3.entrySet())  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		  
		  System.out.println("\ncontainsKey : "+hm3.containsKey(102));
		  System.out.println(hm3.containsValue("Ram"));
	}
}
