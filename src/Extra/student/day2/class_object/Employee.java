package day2.class_object;

public class Employee {

	double salary;
	double bonus;
	
	void calpay(){
		double totalpayment = salary + bonus;
		System.out.println("Totalpayment = "+totalpayment);
	}

}
