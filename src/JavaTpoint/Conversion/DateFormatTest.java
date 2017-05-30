package Conversion;

import java.text.DateFormat;  
import java.util.Date;  

public class DateFormatTest {

	public static void main(String[] args) {
		Date currentDate = new Date();  
		String dateToStr;
		
		System.out.println("Current Date: "+currentDate);  
         dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  

 
        System.out.println("Current Date: "+currentDate);  
  
         dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
	
        System.out.println("\nString to Date ");  
        //Date d = DateFormat.getDateInstance().parse("31 Mar, 2015");  
       // System.out.println("Date is: "+d);  
	
	}

}
