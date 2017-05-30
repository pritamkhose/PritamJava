package studentinfo;

import info.Course;

public class Test {

	public static void main(String[] args) {
		Student st=new Student("a","b","c");
		
		System.out.println("fname: "+st.fname);
		System.out.println("fname: "+st.lname);
		System.out.println("fname: "+st.mname);
		
		Address ad=st.getAddress();
		System.out.println("city: "+ad.city);
		System.out.println("country: "+ad.Country);
		
		Course cd=st.getDetails();
		System.out.println("CourseName: "+cd.cname);
		System.out.println("RollNo: "+cd.rollno);
		
	}

}
