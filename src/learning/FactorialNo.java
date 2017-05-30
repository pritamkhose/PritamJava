package com.assignment;

public class FactorialNo {

	public void Factorial(Integer num){
		Integer fact=1;
		
		for (int i = 1; i <= num; i++) {
			
			fact=fact*i;
		}
		
		System.out.println(fact);
	}
}
