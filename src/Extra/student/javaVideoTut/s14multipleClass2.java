package javaVideoTut;

public class s14multipleClass2 {
	private String myName;
	
	public String getname(){
		return myName;
	}
	
	public void setname(String name){
		myName = name;
	}
	public void msg(String name){
		System.out.println("Hello "+name);
		
		System.out.printf("Hi %s ",getname());//myName);
	}
}
