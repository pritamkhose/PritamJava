package DurgaSoft.Array_Basic;

public class AynnomusArray {

	public static void main(String[] args) {
		sum(new int[]{10,20,30,80,-100});

	}


static void sum(int[] x) {

	int total = 0;
	
	for (int x1 = 0; x1< x.length; x1++){
		total = total + x[x1];
	}
	System.out.println(total);
	}
}