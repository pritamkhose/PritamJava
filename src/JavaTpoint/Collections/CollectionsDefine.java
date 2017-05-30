package JavaTpoint.Collections;

import java.util.*;

public class CollectionsDefine {

   public static void main(String[] args) {
	   	  
	   //ArrayList 
      List a1 = new ArrayList();
	  //ArrayList a1 = new ArrayList();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      a1.add("Zara");
      System.out.println("\nArrayList");
      System.out.print("\t" + a1);
      

      //LinkedList
      LinkedList l1 = new LinkedList();
      //List l1 = new LinkedList();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      l1.add("Zara");
      System.out.println("\nLinkedList");
      System.out.print("\t" + l1);
      
      //Vector
      Vector v1 = new Vector();
      v1.add("Zara");
      v1.add("Mahnaz");
      v1.add("Ayan");
      v1.add("Zara");
      System.out.println("\nVector");
      System.out.println("\t" + v1);
      

      // Create a reverse order comparator
      Comparator r = Collections.reverseOrder();
      // Sort list by using the comparator
      Collections.sort(l1, r);
      // Get iterator
      Iterator li = l1.iterator();
      System.out.println("Iterator sorted in reverse: ");
      while(li.hasNext()){
          System.out.print(li.next() + " ");
       }
      System.out.print("\n");
      
      //Stack
      Stack<String> st=new Stack<String>();    
      st.add("Zara");
      st.add("Mahnaz");
      st.add("Ayan"); 
      st.add("Zara");
      System.out.println("\nStack");
      System.out.print("\t" + st); 
      

      //HashSet
      //HashSet s1 = new HashSet(); 
      Set s1 = new HashSet(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      s1.add("Zara");
      System.out.println("\nHashSet");
      System.out.print("\t" + s1);
      
      
      //Hashtable
      Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
      hm.put(100,"Amit");  
      hm.put(102,"Ravi");  
      hm.put(101,"Vijay");  
      hm.put(103,"Rahul");  
      System.out.println("\nHashtable Elements");
      System.out.print("\t" + hm);
      
      //HashMap
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Zara", "18");
      System.out.println("\nHashMap Elements");
      System.out.print("\t" + m1);
      
      //WeakHashMap
      WeakHashMap s2 = new WeakHashMap();
      s2.put(100,"Amit");  
      s2.put(102,"Ravi");  
      s2.put(101,"Vijay");  
      s2.put(103,"Rahul"); 
      System.out.println("\nWeakHashMap");
      System.out.print("\t" + s2);
      
      //IdentityHashMap
      IdentityHashMap ihm = new IdentityHashMap();
      ihm.put(100,"Amit");  
      ihm.put(102,"Ravi");  
      ihm.put(101,"Vijay");  
      ihm.put(103,"Rahul"); 
      System.out.println("\nIdentityHashMap");
      System.out.print("\t" + s2);
      
      
      //TreeMap
      TreeMap<Integer,String> tm=new TreeMap<Integer,String>();  
      tm.put(100,"Amit");  
      tm.put(102,"Ravi");  
      tm.put(101,"Vijay");  
      tm.put(103,"Rahul");
      System.out.println("\nTreeMap Elements");
      System.out.print("\t" + tm);
      
      //LinkedHashMap
      LinkedHashMap<Integer,String> cm=new LinkedHashMap<Integer,String>();  
      cm.put(100,"Amit");  
      cm.put(102,"Ravi");  
      cm.put(101,"Vijay");  
      cm.put(103,"Rahul");
      System.out.println("\nLinkedHashMap Elements");
      System.out.print("\t" + cm);
      
      //Properties
      System.out.println("\nProperties");
      Properties capitals = new Properties();
      Set states;
      String str;
      
      capitals.put("Illinois", "Springfield");
      capitals.put("Missouri", "Jefferson City");
      capitals.put("Washington", "Olympia");
      capitals.put("California", "Sacramento");
      capitals.put("Indiana", "Indianapolis");

      // Show all states and capitals in hashtable.
      states = capitals.keySet(); // get set-view of keys
      Iterator itr = states.iterator();
      while(itr.hasNext()) {
         str = (String) itr.next();
         System.out.println("The capital of " +
            str + " is " + capitals.getProperty(str) + ".");
      }
      System.out.println();
      
   	  // Enumeration
   	  Enumeration days;
      Vector dayNames = new Vector();
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      System.out.println("Enumeration via Vector");
      days = dayNames.elements();
      while (days.hasMoreElements()){
         System.out.println(days.nextElement()); 
      }
   
      // BitSet
      BitSet bits1 = new BitSet(16);
      BitSet bits2 = new BitSet(8);
      // set some bits
      for(int i=0; i<16; i++) {
         if((i%2) == 0) bits1.set(i);
         if((i%5) != 0) bits2.set(i);
      }
      System.out.println("\nBitSet: ");
      System.out.println(bits1);
      System.out.println(bits2);

   }
}