package myJava24;

public class loop_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int x =13;
		
		System.out.print("While loop\n");
		while( x <15){
			System.out.print("value of x : "+ x+"\n");
			x++;
		}
		
		System.out.print("\nDo While loop\n");
		do{
			System.out.print("value of x : "+ x+"\n");
			x--;
	
			}while( x > 12);
		
		System.out.print("\nfor loop with if \n");
		
		for(int y =5; y <10; y = y+1){
			if(y ==7 || y== 6)
				continue;
				else
				System.out.print("value of y : "+ y +"\n");	
			if( x ==9){
				break;
				}
		}
		System.out.print("\n if loop\n");
		
		x =130;
		if( x ==10){
		System.out.print("Value of X is 10");
		}if( x ==20){							//elseif
		System.out.print("Value of X is 20");
		}if( x ==30){
		System.out.print("Value of X is 30");
		}else{
		System.out.print("X ="+x);
		}
	
		System.out.print("\n\n switch case \n");
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
		

		System.out.print("\n Math Pi function \n");
		double degrees =50.0;
		double radians =Math.toRadians(degrees);
		System.out.format("The value of pi is %.4f%n",Math.PI);
		System.out.format("The cosine of %.1f degrees is %.4f%n",
		degrees,Math.cos(radians));
		
	}

}
