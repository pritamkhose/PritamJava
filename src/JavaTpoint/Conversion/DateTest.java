package Conversion;

import java.text.SimpleDateFormat;  
import java.util.Date;  
//import java.sql.Date;

public class DateTest {

	public static void main(String[] args)throws Exception {  
		
		System.out.println("Get Current Date");
		java.util.Date date1=new java.util.Date();  
		System.out.println("\nutil.Date \n" + date1);  
		
		long millis=System.currentTimeMillis();  
		java.util.Date date2=new java.util.Date(millis);  
		System.out.println("\nutil.Date(millis) \n" + date2); 
		java.sql.Date date3=new java.sql.Date(millis);  
		System.out.println("\nsql.Date(millis) \n" + date3);  
	
		Date date4=java.util.Calendar.getInstance().getTime();  
		System.out.println("\nCalendar.getInstance().getTime() \n" + date4);  
	
		//String str="2015-03-31";  
	    //Date date=Date.valueOf(str);//converting string into sql date 
	}  

}
