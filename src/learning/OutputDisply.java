package com.learning;

public class OutputDisply {

	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {

			for (int j = 5-i; j >0; j--){
				System.out.print( " ");
			}
			
			for(int k=0; k<= i;k++){
				System.out.print( "* ");
			}
			
			System.out.println("");

		}
	}
}


/*
 * for(int i=1;i<=7;i++){
                for(int j=1;j<7-(i-1);j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                    for(int k1=1;k1<k;k1+=k){
 
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
 * 
 * 
 * */