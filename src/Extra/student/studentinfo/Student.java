package studentinfo;

//import info.Course;
import info.*;
public class Student {

	//instance var
	String fname;
	String mname;
	String lname;
	Address ad;
	Course cs;
	Student(String fname,String mname,String lname){
		
		this.fname=fname;	// local var
		this.mname=mname;
		this.lname=lname;
		
		
		ad=new Address();
		ad.setAddress("pune","in");
		
		cs=new Course();
		cs.setCourseDetails("ME",01);

	}
	
	Address getAddress(){
		return ad;
	}
	
	Course getDetails(){
		
		return cs;
	}
	
	
	
	
		
	
	
	
	
}
