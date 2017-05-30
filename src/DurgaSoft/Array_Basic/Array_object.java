package DurgaSoft.Array_Basic;

public class Array_object {
	public static void main(String[] args) {
	
		Object[] a = new Object[10];
		a[0] = new Integer(10);
		a[1] = new Double(10.59);
		a[2] = new Float(-10.103f);
		a[3] = new Byte((byte) 11);
		a[4] = new Short((short) 14);
		a[5] = new Long(-10);
		
		for(int alen = 0; alen < a.length; alen++)
		System.out.println(a[alen]);
	}
}
