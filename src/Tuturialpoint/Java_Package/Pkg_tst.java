package Tuturialpoint.Java_Package;

//import java.lang.*;
//import TutorialsPont;
import Java_Polymorphism.*;
import Java_Encapsulation.EncapTest;
import Java_Encapsulation.RunEncap;

public class Pkg_tst {

	public static void main(String[] args) {
		  Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	    
	      EncapTest encap = new EncapTest();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("\nName : " + encap.getName()
	      + " Age : " + encap.getAge()
	      + " IdNum : " + encap.getIdNum());
	}

}
