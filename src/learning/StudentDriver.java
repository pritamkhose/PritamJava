package com.learning;

public class StudentDriver {

	public static void main(String[] args) {
	//	Student nik=new Student(123, "Nikita");

		Student nik=new Student(null, null);
		
		
	nik.setName("Nikita");
		nik.setRollNumber(123);
		
		System.out.println(nik.getName());
		System.out.println(nik.getRollNumber());
	}
}
