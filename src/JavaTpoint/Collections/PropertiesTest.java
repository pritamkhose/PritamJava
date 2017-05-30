package JavaTpoint.Collections;


import java.util.*;  
import java.io.*;  

public class PropertiesTest {  
	
public static void main(String[] args)throws Exception{  
    /*FileReader reader=new FileReader("db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
    
    
    //Properties class to get all the system properties
    Set set=p.entrySet();  
    
    Iterator itr=set.iterator();  
    while(itr.hasNext()){  
    Map.Entry entry=(Map.Entry)itr.next();  
    System.out.println(entry.getKey()+" = "+entry.getValue());  
    
    */
    Properties p1=new Properties();  
    p1.setProperty("name","Sonoo Jaiswal");  
    p1.setProperty("email","sonoojaiswal@javatpoint.com");  
      
    p1.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
    
    }   

}  


/*
 Method	Description
public void load(Reader r)	loads data from the Reader object.
public void load(InputStream is)	loads data from the InputStream object
public String getProperty(String key)	returns value based on the key.
public void setProperty(String key,String value)	sets the property in the properties object.
public void store(Writer w, String comment)	writers the properties in the writer object.
public void store(OutputStream os, String comment)	writes the properties in the OutputStream object.
storeToXML(OutputStream os, String comment)	writers the properties in the writer object for generating xml document.
public void storeToXML(Writer w, String comment, String encoding)	writers the properties in the writer object for generating xml document with specified encoding.
 
*/