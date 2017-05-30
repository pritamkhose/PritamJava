package com.assignment;

public class Display {

	public static void main(String[] args) {
		
		for (int i = 4; i > 0; i--) {
			
			for (int j = 7-i; j > 0; j--) {
				System.out.print(" ");
				
			}
			
			for (int j = 2*i-1; j > 0; j--) {
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
	}
}
