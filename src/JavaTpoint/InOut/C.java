package InOut;
	
	import java.io.*;  
	class C{  
	public static void main(String args[])throws Exception{  
	FileInputStream fin=new FileInputStream("C.java");  
	FileOutputStream fout=new FileOutputStream("M.java");  
	int i=0;  
	while((i=fin.read())!=-1){  
	fout.write((byte)i);  
	}  
	fin.close();  
	}  
	} 