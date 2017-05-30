package DurgaSoft.Array_Basic;

public class Array_init {

	public static void main(String[] args) {

		int[] AD1 = new int[5];
		int [][]AD2 = new int[2][3];
		int AD3[][][] = new int[3][2][4];
		
		System.out.println(AD1.length); 	// use for any no.
		System.out.println();
		
		System.out.println(AD2.length);
		System.out.println(AD2[0].length);
		System.out.println(AD2[1].length);
		System.out.println();
		
		System.out.println(AD3.length);
		System.out.println(AD3[1].length);
		System.out.println(AD3[2][1].length);
		System.out.println(AD3[2][0].length);
		System.out.println();
		
		String s1 = "Ram";
		System.out.println(s1.length());		// use for string
		
		int[] LA1 = {1,2,3};
		int[][] LA2 = {{1,2,3},{4,5},{6}};
		int[][][] LA3 = {{{1,2,3},{4,5},{6}},{{7,8},{9}}};
		
		System.out.println(LA1[1]);
		System.out.println(LA2[1][0]);
		System.out.println(LA3[0][2][0]);
		System.out.println();
		
		
		byte[] b = {10,20,30};
		short[] s = {10,20,30};
		int[] i = {10,20,30};
		long[] l = {10,20,30};
		double[] d = {10,20,30};
		float[] f = {10,20,30};
		char[] c = {'a','e','i'};
		System.out.println(b[0]);
		System.out.println(s[1]);
		System.out.println(i[2]);
		System.out.println(l[0]);
		System.out.println(d[1]);
		System.out.println(f[2]);
		System.out.println();
		
		String[] st = {"ram","sham","uma"};
		System.out.println(st[2]);
		System.out.println();
		
	}

}
