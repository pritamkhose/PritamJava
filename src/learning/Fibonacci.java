package com.assignment;

public class Fibonacci {

	public void FibonacciSeries(Integer num){
		Integer a=0, b=1, c=0;
		
		while(num > 0){
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(c);
			System.out.print(" ");
			num--;
		}
	}
}
