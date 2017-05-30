package DurgaSoft.loop_control;

public class loop_control {

	public static void main(String[] args) {

			int x =13;
			
			while( x <15){
				System.out.print("value of x : "+ x+"\n");
				x++;
			}
			System.out.print("\n");
			
			do{
				System.out.print("value of x : "+ x+"\n");
				x--;
		
				}while( x > 12);
			System.out.print("\n");
			
			for(int y =5; y <10; y = y+1){
				if(y ==7 || y== 6)
					continue;
					else
					System.out.print("value of y : "+ y +"\n");	
				if( x ==9){
					break;
					}
			}
			System.out.print("\n");
			
			x =130;
			if( x ==10){
			System.out.print("Value of X is 10");
			}if( x ==20){
			System.out.print("Value of X is 20");
			}if( x ==30){
			System.out.print("Value of X is 30");
			}else{
			System.out.print("This is else statement");
			}
		

			char grade = 'd';
			switch(grade)
			{
			case'A':
			System.out.println("Excellent!");
			break;
			case'B':
			case'C':
			System.out.println("Well done");
			break;
			case'D':
			System.out.println("You passed");
			case'F':
			System.out.println("Better try again");
			break;
			default:
			System.out.println("Invalid grade");
			}
			System.out.println("Your grade is "+ grade);
			}
	
	
		/*	double degrees =50.0;
			double radians =Math.toRadians(degrees);
			System.out.format("The value of pi is %.4f%n",Math.PI);
			System.out.format("The cosine of %.1f degrees is %.4f%n",
			degrees,Math.cos(radians));*/
			
	}
	
