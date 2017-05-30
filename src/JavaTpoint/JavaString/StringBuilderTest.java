package JavaString;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder  sb=new StringBuilder ("Hello ");  
		
		System.out.println(sb.length());
		
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  

		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
		sb.delete(1,7);  
		System.out.println(sb); 
		
		sb.reverse();  
		System.out.println(sb);
		
		System.out.println(sb.capacity());  
		sb.append("Hello");  
		System.out.println(sb.capacity());
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());
		//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  
	}

}
