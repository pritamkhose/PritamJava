package com.assignment;



public class Hwk9 {
	static String VOWEL_GROUP = "AEIOUaeiou";
	static String testString = "Nikita"; // say this is your text

	public static void main(String[] args) {
	    int vovelCount = 0;
	    // int consonantCount = 0;
	    
	    for (int j = testString.length() - 1; j >= 0; j--) {
	        for (int i = 0; i < VOWEL_GROUP.length(); i++) { 
	            if (VOWEL_GROUP.charAt(i) == testString.charAt(j)) {
	                vovelCount++;
	                break;
	            }
	         
	        }
	    }
	   	    
	    System.out.println(vovelCount+" ");
	}

}
