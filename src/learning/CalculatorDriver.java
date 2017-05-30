package com.learning;

public class CalculatorDriver {
	
	public int result;
	Calculator calci= new Calculator();
	
	
	public void setAdd(int num1,int num2){
		//calci.add(20, 10);
		
		System.out.println(calci.add(num1, num2));
	}
	
	public void setSubtract(int num1, int num2){
		calci.subtract(20, 10);
	}
	
	public void setMultiply(int num1, int num2){
		calci.multiply(20, 10);
	}
	
	public void setDivision(int num1, int num2){
		calci.divide(20, 10);
	}
	

}
