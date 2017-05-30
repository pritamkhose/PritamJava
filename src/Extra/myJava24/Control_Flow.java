
public class Control_Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("ifelse");
		   int testscore = 76;
	        char grade;

	        if (testscore >= 90) {
	            grade = 'A';
	        } else if (testscore >= 80) {
	            grade = 'B';
	        } else if (testscore >= 70) {
	            grade = 'C';
	        } else if (testscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Grade = " + grade);
	    
	
	System.out.println("\nswitch");
	  int month = 2;
      int year = 2000;
      int numDays = 0;

      switch (month) {
          case 1: case 3: case 5:
          case 7: case 8: case 10:
          case 12:
              numDays = 31;
              break;
          case 4: case 6:
          case 9: case 11:
              numDays = 30;
              break;
          case 2:
              if (((year % 4 == 0) && 
                   !(year % 100 == 0))
                   || (year % 400 == 0))
                  numDays = 29;
              else
                  numDays = 28;
              break;
          default:
              System.out.println("Invalid month.");
              break;
      }
      System.out.println("Number of Days = " + numDays);
     
	System.out.println("\nSwitchDemo");
	java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

         month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    
	System.out.println("\ndo while");
	int count = 7;
    do {
        System.out.println("Count is: " + count);
        count++;
    } while (count < 11);
	
	
    System.out.println("\nwhile");
	count = 10;
    while (count > 5) {
        System.out.println("Count is: " + count);
        count--;
    }
    
    
    System.out.println("\nfor");
    for(int i=8; i<11; i++){
        System.out.println("Count is: " + i);
   }
    
    System.out.println("\nbreak");

    int[][] arrayOfInts = { 
        { 32, 87, 3, 589 },
        { 12, 1076, 2000, 8 },
        { 622, 127, 77, 955 }
    };
    int searchfor = 12;

    int i;
    int j = 0;
    boolean foundIt = false;

search:
    for (i = 0; i < arrayOfInts.length; i++) {
        for (j = 0; j < arrayOfInts[i].length;j++) {
            if (arrayOfInts[i][j] == searchfor) {
                foundIt = true;
                break search;
            }
        }
    }

    if (foundIt) {
        System.out.println("Found " + searchfor + " at " + i + ", " + j);
    } else {
        System.out.println(searchfor + " not in the array");
    }
	
	
    System.out.println("\ncontinue");
    String searchMe = "peter piper picked a " + "peck of pickled peppers";
    int max = searchMe.length();
    int numPs = 0;

    for (i = 0; i < max; i++) {
        // interested only in p's
        if (searchMe.charAt(i) != 'p')
            continue;

        // process p's
        numPs++;
    }
    System.out.println("Found " + numPs + " p's in the string."); 
	}
}