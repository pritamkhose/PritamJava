package JavaString;

public class toStringTest {

	 int rollno;  
	 String name;  
	 String city;  
	  
	 toStringTest(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	
	 /*// uncomment for proper output
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  */
	 
	public static void main(String[] args) {
		 toStringTest s1=new toStringTest(101,"Raj","lucknow");  
		  toStringTest s2=new toStringTest(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  

	}

}
