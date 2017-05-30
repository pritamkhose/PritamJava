package tutorialspoint;

import java.util.GregorianCalendar;

public class FinalizeCode extends GregorianCalendar{

	public static void main(String[] args) {
	
		 try {
			   // create a new ObjectDemo object
			 FinalizeCode cal = new FinalizeCode();

			   // print current time
			   System.out.println("" + cal.getTime());

			   // finalize cal
			   System.out.println("Finalizing...");
			   cal.finalize();
			   System.out.println("Finalized.");

			   } catch (Throwable ex) {
			   ex.printStackTrace();
			   }

	}

}
