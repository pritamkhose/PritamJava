
import java.util.ArrayList;
import java.util.HashMap;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pritam
 */
public class jsonandroid {

   
      String injson = "{\"login\":{\"1\":[{\"id\":\"1\"},{\"username\":\"pritam\"},{\"password\":\"123\"},{\"mobile\":\"9762752260\"},{\"email\":\"pritamkhose@gmail.com\"},{\"createdate\":\"2016-12-18 23:49:32.0\"},{\"birthday\":\"1991-01-04\"},{\"active\":\"1\"},{\"account\":\"khose\"},{\"desg\":\"SW eng\"},{\"deparment\":\"Develomment\"},{\"branch\":\"IT\"}],\"2\":[{\"id\":\"2\"},{\"username\":\"nikita\"},{\"password\":\"123\"},{\"mobile\":\"9420037410\"},{\"email\":\"n.khose@gmail.com\"},{\"createdate\":\"2016-12-18 23:50:46.0\"},{\"birthday\":\"1993-02-06\"},{\"active\":\"1\"},{\"account\":\"khose\"},{\"desg\":\"SW eng\"},{\"deparment\":\"Develomment\"},{\"branch\":\"IT\"}]}}";

      public static void main(String args[]) throws ParseException {
          ArrayList<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
          
         json1();
          
      }
     
       private static void json1() {
      
     JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(injson); 
                JSONObject jsonObject1 = (JSONObject) parser.parse(jsonObject.get(tb).toString());
                JSONArray newJArray = new JSONArray(jsonObject1.get("1").toString());
               
                 for(int i = 0; i < tableheader.size(); i++){
                     	HashMap<String, String> hm = new HashMap<String, String>();
                        hm.put(tableheader.get(i).toString(),((JSONObject) parser.parse(newJArray.get(i).toString())).get(tableheader.get(i).toString()).toString());
			aList.add(hm);
                 } 
          
    }
}
