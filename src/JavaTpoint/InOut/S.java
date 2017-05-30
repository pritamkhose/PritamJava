package InOut;


	import java.io.*;  
	
	class S{  
	 public static void main(String args[])throws Exception{  
	  FileOutputStream fout1=new FileOutputStream("ByteArrayOutputStream 1.txt");  
	  FileOutputStream fout2=new FileOutputStream("ByteArrayOutputStream 2.txt");  
	  
	  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
	  bout.write(132);  
	  bout.writeTo(fout1);  
	  bout.writeTo(fout2);  
	  
	  bout.flush();  
	  bout.close();//has no effect  
	  System.out.println("success...");  
	 }  
	} 