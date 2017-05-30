package JavaString;

import java.util.Locale;

public class StringExample {

	public static void main(String[] args) {
		String s1="Javapoint";//creating string by java string literal  
		System.out.println(s1);  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		for(int i=0;i<ch.length;i++){  
			System.out.print(ch[i]);  
			}  
		
		System.out.println(s2);    
		String s3=new String("example");//creating java string by new keyword  
		System.out.println(s3);  
		
		String name="sonoo";  
		String sf1=String.format("name is %s .",name);  
		System.out.println(sf1); 
		String sf3=String.format("value is %32.12f",32.33434);
		//returns 12 char fractional part filling with 0    
		System.out.println(sf3);
		
		System.out.println(s1.substring(2,4));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint  
		System.out.println(s3.charAt(4));
		System.out.println(ch.length);
		System.out.println(String.join("-","welcome","to","javatpoint")); 
		System.out.println(s1.concat(" welcome")); 
		System.out.println(s1.endsWith("point"));  
		System.out.println(s1.startsWith("Java"));
		
		String a1="hello";  
		String a2="hello";  
		String a3="meklo";  
		String a4="hemlo";  
		System.out.println(a1.compareTo(a2));  
		System.out.println(a1.compareTo(a3));  
		System.out.println(a1.compareTo(a4));  
		
		
		System.out.println(s1.replace('J','e'));
		System.out.println(s1.replace("point"," Learn"));
		//System.out.println(ch.replaceFirst());
		
		String s4=".  hello string   > "; 
		System.out.println(s4.trim());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Javapoint"));
		System.out.println(s1.isEmpty());
		
		String name1="what do you know about me";  
		System.out.println(name1.contains("do you know"));   
		System.out.println(name1.contains("hello"));  
		
		String s5="java string split method by javatpoint";  
		String[] words=s5.split("\\s");//splits the string based on string  
		//using java for each loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  // using Rgex
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		
		
		String s21="ABCDEFG";  
		byte[] barr=s21.getBytes();  
		for(int i=0;i<barr.length;i++) 
		System.out.println(barr[i]);  

		String s11=new String("hello");  
		String s12="hello";  
		String s13=s11.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s11==s12);//false because reference is different  
		System.out.println(s12==s13);//true because reference is same  
	
		s5="this is index of example"; 
		//passing substring  
		int index1=s5.indexOf("is");//returns the index of is substring  
		int index2=s5.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s5.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s5.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3  
		System.out.println(s5.lastIndexOf('s'));
	}

}
