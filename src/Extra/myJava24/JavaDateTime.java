package myJava24;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class JavaDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instantiate a Date object
		Date date =new Date();
		// display time and date using toString()
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: "+ ft.format(date));
	
		String str =String.format("Current Date/Time : %tc", date );
		System.out.printf(str);
		
		// display time and date using toString()
		System.out.printf("\n%1$s %2$tB %2$td, %2$tY","Due date:", date);
	
		// display formatted date
		System.out.printf("%s %tB %<te, %<tY","Due date:", date);
		
		System.out.printf("\n\nParsing Strings into Dates");
		SimpleDateFormat ft2 =new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length ==0?"1818-11-11": args[0];
		System.out.print(input +"\nParses as ");
		Date t;
		try{
		t = ft2.parse(input);
		System.out.println(t);
		}catch(ParseException e){
		System.out.println("Unparseable using "+ ft2);
		
		System.out.printf("\n\nSleeping for a While:");
		try{
			System.out.println(new Date()+"\n");
			Thread.sleep(5*60*10);
			System.out.println(new Date()+"\n");
			}catch(Exception e1){
			System.out.println("Got an exception!");
		}
		}
		
		System.out.printf("\n\nGregorianCalendar");
		String months[]={
				"Jan","Feb","Mar","Apr",
				"May","Jun","Jul","Aug",
				"Sep","Oct","Nov","Dec"};
				int year;
				// Create a Gregorian calendar initialized
				// with the current date and time in the
				// default locale and timezone.
				GregorianCalendar gcalendar =new GregorianCalendar();
				// Display current time and date information.
				System.out.print("Date: ");
				System.out.print(months[gcalendar.get(Calendar.MONTH)]);
				System.out.print(" "+ gcalendar.get(Calendar.DATE)+" ");
				System.out.println(year = gcalendar.get(Calendar.YEAR));
				System.out.print("Time: ");
				System.out.print(gcalendar.get(Calendar.HOUR)+":");
				System.out.print(gcalendar.get(Calendar.MINUTE)+":");
				System.out.println(gcalendar.get(Calendar.SECOND));
				// Test if the current year is a leap year
				if(gcalendar.isLeapYear(year)){
				System.out.println("The current year is a leap year");
				}
				else{
				System.out.println("The current year is not a leap year");
				}
	}
}
