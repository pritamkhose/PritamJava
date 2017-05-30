package day1.test1;

public class MyClassTst_if {

	public static void main(String[] args) {
	int x = -10;
	int y = -10;
	
/*	if (x > 0 && y > 0) // relational operator are == != > < >= <=
		System.out.println("x & y both r +ve "+x+"\t"+y);
	else if (x > 0 || y > 0)
		System.out.println("only x or y r +ve "+x+"\t"+y);
	else {
		System.out.println("both r -ve has value\n x = "+x+"\n y = "+y);
		}
*/
	
/*	for(int i =0; i <5; i++){
		System.out.println(i);}
*/	
	
/*	while (x < 15){
		x +=1; //x++; // x = x + 1; 
		System.out.println(x);}
	}*/
	
/*	x = 3;
	do{ System.out.println("x = "+x);
		x--;
		}while (x > 0);
		*/

//	x=5;
/*	switch(x){
	case 0 : System.out.println("x is 1 or = "+x); break;
	case 1 : System.out.println("x is 1 or = "+x); break;
	case 2 : System.out.println("x is 1 or = "+x); //break;
	case 3 : System.out.println("x is 1 or = "+x); break;
	default  : System.out.println("not find = "+x); break;
	}
	*/
	
/*	String l = "two";
	switch(l){
	case "one" : System.out.println("x is 1 or = "+x); break;
	case "two" : System.out.println("x is 2 or = "+x); break;
	default  : System.out.println("not find = "+x); break;
	}	*/
	
/*	int [] a = {10,20,30};
	String [] st = {"a","b","c","d"};
	System.out.println(a[0]+a[2]);
	System.out.println("------------");
	for(int temp : a){
	System.out.println(temp);}
	System.out.println("------------");
	for(String temp2 : st){
	System.out.println(temp2);}*/
	
/*	int temp9 = 4;
	int[][] twodim = new int[2][3];
	for(int i =0; i <2; i++){
		for(int j =0; j <3; j++){
			twodim[i][j] = temp9;
			temp9 += 2;
			}
		}
	
	for(int i =0; i <2; i++){
		for(int j =0; j <3; j++){
			System.out.print(twodim[i][j]+" ");
		}
	System.out.println();}*/
	
	String my = "Pritam KUMAR";
			System.out.print("Hello, "+my+"\n");
			System.out.print(my.substring(0,6));
			System.out.print(my.substring(6).toLowerCase());
			System.out.print("\n"+my.toUpperCase());
			System.out.print("\n"+my.charAt(9));	
	String age = "22";
	int agei = Integer.parseInt(age)/7;
	double aged = Double.parseDouble(age)/7;
	System.out.print("\n"+agei+"\n"+aged);
	}
}		
