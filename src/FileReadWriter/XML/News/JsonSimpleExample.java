/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReadWriter.XML.News;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * *

 * @author Pritam
 */
public class JsonSimpleExample {
   
    
     public static void main(String[] args) {
    
    
   
         

	try {

		FileWriter file  = new FileWriter("test5.json");
                
                 for(int i = 0; i < 5; i++) {
                  JSONObject obj = new JSONObject();
	obj.put("name", "mkyong.com");
	obj.put("age", new Integer(100));

	JSONArray list = new JSONArray();
	list.add("msg 1");
	list.add("msg 2");
	list.add("msg 3");

	obj.put("messages", list);
		file.write(obj.toJSONString());
                
                 }
		file.flush();
		file.close();

	} catch (IOException e) {
		e.printStackTrace();
	}

	//System.out.print(obj);

     }
}
