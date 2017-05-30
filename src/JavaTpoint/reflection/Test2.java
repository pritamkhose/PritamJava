package JavaTpoint.reflection;

	  
	class Test2{  
	 public static void main(String args[]){  

	 }  
	}  
	
	/*
	javap fully_class_name  
	Example to use javap tool

	javap java.lang.Object  
	Output:
	Compiled from "Object.java"  
	public class java.lang.Object {  
	  public java.lang.Object();  
	  public final native java.lang.Class<?> getClass();  
	  public native int hashCode();  
	  public boolean equals(java.lang.Object);  
	  protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;  
	  public java.lang.String toString();  
	  public final native void notify();  
	  public final native void notifyAll();  
	  public final native void wait(long) throws java.lang.InterruptedException;  
	  public final void wait(long, int) throws java.lang.InterruptedException;  
	  public final void wait() throws java.lang.InterruptedException;  
	  protected void finalize() throws java.lang.Throwable;  
	  static {};  
	}  
	Another example to use javap tool for your class

	Let's use the javap command for our java file.

	class Simple{  
	public static void main(String args[]){  
	System.out.println("hello java");  
	}  
	}  
	Now let's use the javap tool to disassemble the class file.

	javap Simple  
	Output:
	Compiled from ".java"  
	class Simple {  
	  Simple();  
	  public static void main(java.lang.String[]);  
	}  
	javap -c command

	You can use the javap -c command to see disassembled code. The code that reflects the java bytecode.

	javap -c Simple  
	Output:
	Compiled from ".java"  
	class Simple {  
	  Simple();  
	    Code:  
	       0: aload_0         
	       1: invokespecial #1                  // Method java/lang/Object."<init>":()V  
	       4: return          
	  
	  public static void main(java.lang.String[]);  
	    Code:  
	       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;  
	       3: ldc           #3                  // String hello java  
	       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V  
	       8: return          
	}  
	*/