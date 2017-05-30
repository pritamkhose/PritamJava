package day2.class_object;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee prem = new Employee();
		Employee rani = new Employee();
		Employee raj = new Employee();
	
	prem.salary = 10000; prem.bonus = 1000;
	rani.salary = 20000; rani.bonus = 2000;
	raj.salary = 25000; raj.bonus=prem.salary;
	
	prem.calpay();
	rani.calpay();
	raj.calpay();
	
	}

}
