package JavaTpoint.reflection;

class Simple1{  
	 void message(){System.out.println("Hello Java");}  
	}  
	  
	class Test1{  
	 public static void main(String args[]){  
	  try{  
	  Class c=Class.forName("Simple1");  
	  Simple1 s=(Simple1)c.newInstance();  
	  s.message();  
	  
	  }catch(Exception e){System.out.println(e);}  
	  
	 }  
	}  