package com.assignment;

public class CountVowels {

	public void CountVowels(String string1){
		int count = 0;
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < string1.length(); i++) {
        	char ch = string1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                            ch == 'o' || ch == 'u')
            {
                    vowels++;
            }
            else
            { 
                    consonants++;
            }
    
			
		}
	
		
	}
	
	
	
	/*private String name;
	
	
	CountVowels(String name) {
		
		this.name=name;
		
			}
	public void setName(String name) {
		this.name=name;
	}
	

	
	public String getName() {
		return name;
	}*/
}
