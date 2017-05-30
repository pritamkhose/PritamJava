package com.learning;

public class Student {

	private Integer rollNumber;
	private String name;
	
	
	Student(Integer rollNumber, String name) {
		
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
/*	Student(Integer rollNumber) {
		this.rollNumber=rollNumber;
		this.name="Default"; 
	}*/
	
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Integer getRollNumber(){
		return rollNumber;
	}
	
	public String getName() {
		return name;
	}
}
