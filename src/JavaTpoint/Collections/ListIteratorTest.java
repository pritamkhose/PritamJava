package JavaTpoint.Collections;
import java.util.*;

public class ListIteratorTest {

	public static void main(String[] args) {
	      //ArrayList 
	      List a1 = new ArrayList();
	      a1.add("Ayan");
	      a1.add("Rani");
	      a1.add("Maya");
	      a1.add("Zara");
	      System.out.println("ArrayList");
	      System.out.print("\t" + a1);

	      ListIterator<String> itr=a1.listIterator();  
	      
	      System.out.println("\n\nelements in forward direction...");  
	      while(itr.hasNext()){  
	      System.out.println(itr.next());  
	      }  
	        
	      System.out.println("\nelements in backward direction...");  
	      while(itr.hasPrevious()){  
	      System.out.println(itr.previous());  
	      }  
	      
	      //itr.set("1");
	      System.out.println("\ngetClass name : "+itr.getClass());
	      
	      /*  System.out.println("\nequals...");  
	      while(itr.hasNext()){  
		      System.out.println(itr.equals("Zara"));
		  }  
	      
	     System.out.println("\ntoString...");  
	      while(itr.hasNext()){  
		      System.out.println(itr.toString());
		  }
		  
		  System.out.println("\nforward index...");  
	      while(itr.hasNext()){  
		      System.out.println(itr.nextIndex());  
		  }  
		  
	      System.out.println("\nReverse index...");  
	      while(itr.hasNext()){  
		      System.out.println(itr.previousIndex());  
		  }  */
	}

}
