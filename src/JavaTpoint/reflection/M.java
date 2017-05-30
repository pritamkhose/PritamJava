package JavaTpoint.reflection;

import java.lang.reflect.*;  
class M{  
public static void main(String args[])throws Exception{  
Class c=A.class;  
Object obj=c.newInstance();  
  
Method m=c.getDeclaredMethod("cube",new Class[]{int.class});  
m.setAccessible(true);  
m.invoke(obj,4);  
}}  