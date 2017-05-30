package FileReadWriter.XML.News;


import FileReadWriter.XML.tutorialspoint.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import java.io.FileOutputStream;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;
import java.sql.*;



public class TOI9JSON{  
	
	public static int link_inc=0,articleID = 0,feedlink =0;
	public static String domainurl,domain;
	
	 static ArrayList arrlist_article =  new ArrayList();
	
	 //static XMLEventWriter eventWriter;
	 
    public static void main( String[] args ) {  
    	ArrayList arrlist_feed =  new ArrayList();   
    	
    	
    	try{
    	
    	 domain = "http://timesofindia.indiatimes.com";
    	 domainurl = "http://timesofindia.indiatimes.com/rss.cms";
    	 
    	 Document doc = Jsoup
					.connect(domainurl)
					.userAgent(
							"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21"
									+ " (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21")
					.timeout(999999999).get();
		 
		
		 Elements links = doc.getElementsByClass("tbody");  
     
		
		// Set<String> arrlist1 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		 
      links = doc.select("a[href]");  
        for (Element link : links) {  
     	   String linkurl = link.attr("href"); 
     	   
     	if (linkurl.contains(".cms") && linkurl.contains("http://timesofindia.indiatimes.com/rssfeeds/") &&
     			!linkurl.contains("google") && !linkurl.contains("yahoo")  && 
     			!linkurl.contains("newsgator") && !linkurl.contains("live"))   
     	   arrlist_feed.add(linkurl); 		   
        }  
        
        // add elements to arraylist, including duplicates
        Set<String> hs = new HashSet<String>();
        hs.addAll(arrlist_feed);
        arrlist_feed.clear();
        arrlist_feed.addAll(hs);
      
        System.out.println("List of feed = "+String.valueOf(arrlist_feed.size()));
        
       for(feedlink=0;feedlink<arrlist_feed.size();feedlink++){
        //for(feedlink=0;feedlink<7;feedlink++){
       
       getfeedlink(arrlist_feed.get(feedlink).toString());
       //System.out.println("feed "+feedlink+" "+ arrlist_feed.get(feedlink));
       System.out.println("progress = "+((feedlink*100)/arrlist_feed.size())+" %");	  
       }
       System.out.println("get all article");	   

       
       try {

		FileWriter file  = new FileWriter("TOIjson.json");
                
         for(int db_inc=0;db_inc < arrlist_article.size()-8;db_inc=db_inc+8) 
       {
	   
	   // Insert Enquiry into db
        	 ArrayList arrlist_db=  new ArrayList();   
        	 arrlist_db.add(arrlist_article.get(db_inc).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+1).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+2).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+3).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+4).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+5).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+6).toString());
        	 arrlist_db.add(arrlist_article.get(db_inc+7).toString());
        	 
                        
                    JSONObject obj = new JSONObject();
                    obj.put( "ID", 		arrlist_db.get(0).toString());
                    obj.put( "DomainURL", 	arrlist_db.get(1).toString());
                    obj.put( "rssfeedURL", 	arrlist_db.get(2).toString());
                    obj.put( "ArticleURL",	arrlist_db.get(3).toString());
                    obj.put( "Heading", 	arrlist_db.get(4).toString());
                    obj.put( "time_cap", 	arrlist_db.get(5).toString());
                    obj.put( "image",           arrlist_db.get(6).toString());
                    obj.put( "text", 		arrlist_db.get(7).toString());
                    file.write(obj.toJSONString());
			arrlist_db.removeAll(arrlist_db);
		}
                file.flush();
		file.close();
                } catch (IOException e) {
		e.printStackTrace();
	}
         
            	System.out.println("json done");	    	        

	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	   //   System.out.println("Exception Occure due to network");  
			e.printStackTrace();  
			feedlink++;
	     // System.exit(0);
	    }
  }

  



	public static void getfeedlink(String feedurl) {
		// TODO Auto-generated method stub

		try{
	    	
	    	 
	    	 Document doc = Jsoup
						.connect(feedurl)
						.userAgent(
								"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21"
										+ " (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21")
						.timeout(999999999).get();
			 
			 ArrayList arrlist_link =  new ArrayList();	
	    	
			 
			 Elements links = doc.getAllElements();
	           for (Element link : links) {  
	        	   String s = link.text();
	        	   if(s.contains(".cms") && s.startsWith("http://") && !s.contains("photo"))
	        	   arrlist_link.add(s); 	
	           }  
	           
	          // add elements to arraylist, including duplicates
	           Set<String> hs = new HashSet<String>();
	           hs.addAll(arrlist_link);
	           arrlist_link.clear();
	           arrlist_link.addAll(hs);
	        
                   for(link_inc=0;link_inc < arrlist_link.size();link_inc++)
	          // for(link_inc=0;link_inc < 6;link_inc++)
	           {
	        	  // System.out.println("link "+link_inc+"= \t"+arrlist_link.get(link_inc));
	               
	        	   getarticle(feedurl,arrlist_link.get(link_inc).toString());
	        	   
	           }  
	           	

	    } catch(Exception e)
		{
			System.out.println("Exception Occure @ getfeedlink");  
			e.printStackTrace();  
			link_inc++;
		}
	  
		
	}

	public static void getarticle(String feedurl, String articleurl) {
		
		
		// TODO Auto-generated method stub
		
		try{
			
			
	    	 Document doc = Jsoup
						.connect(articleurl)
						.userAgent(
								"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21"
										+ " (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21")
						.timeout(999999999).get();
			 
	    	 //ArrayList arrlist_article =  new ArrayList();	
	    	 
	    	 String s =  doc.getElementsByClass("Normal").text();
	    	 
	    	 if(!s.isEmpty()){
	    	 
	    		 articleID++;
	    		 
	    		 String c1 = String.valueOf(articleID);
	    		 String c2 = (domainurl);
	    		 String c3 = (feedurl);
	    		 String c4 = (articleurl);
				 
	    		 String c5 = (doc.getElementsByClass("heading1").text());
	    		 if(c5.isEmpty()){
	    			 c5 = "_*_";
	    		 }
	    		 String c6 = (doc.getElementsByClass("time_cptn").text());
	    		 if(c6.isEmpty()){
	    			 c6 = "_*_";
	    		 }
	    		 
	    		 ArrayList img =  new ArrayList();
	    		 Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");  
		           for (Element image : images) {  
		        	   img.add(image.attr("src")); 
		        	   img.add(doc.getElementsByClass("figure-caption").text());
		           }  
		           
		           String c7 =  (domain+img.get(0)); 
		           if(c7.isEmpty()){
		    			 c7 = "_*_";
		    		 }
		           String c8 =  doc.getElementsByClass("Normal").text();
   
		           	 arrlist_article.add(c1);
		    		 arrlist_article.add(c2);
		    		 arrlist_article.add(c3); 
		    		 arrlist_article.add(c4);
		    		 arrlist_article.add(c5);
		    		 arrlist_article.add(c6); 
		    		 arrlist_article.add(c7); 
		    		 arrlist_article.add(c8); 
		           
                             //  System.out.print("ID --> "+c5);
	    	 }

	    } catch(Exception e)
		{
			//System.out.println("Exception Occure @ read article");  
			//e.printStackTrace();  
	    	link_inc++;
	    	
		}
		
	}
    
}  