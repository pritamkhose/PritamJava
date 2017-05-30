import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class XMLEventReaderDemo {
  public static void main(String[] args) throws Exception {
    XMLInputFactory factory = XMLInputFactory.newInstance();
    Reader fileReader = new FileReader("TOI_New.xml");
    XMLEventReader reader = factory.createXMLEventReader(fileReader);
    
          // create an array list
      ArrayList al = new ArrayList();
      List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
    
    while (reader.hasNext()) {
      XMLEvent event = reader.nextEvent();
      if (event.isStartElement()) {
        StartElement element = (StartElement) event;
       // System.out.println("Start Element: " + element.getName());

        Iterator iterator = element.getAttributes();
        while (iterator.hasNext()) {
          Attribute attribute = (Attribute) iterator.next();
          QName name = attribute.getName();
          String value = attribute.getValue();
         // System.out.println("Attribute name/value: " + name + "/" + value);
        }
      }
      if (event.isEndElement()) {
        EndElement element = (EndElement) event;
        //System.out.println("End element:" + element.getName());
      }
      if (event.isCharacters()) {
        Characters characters = (Characters) event;
        //System.out.println("Text: " + characters.getData());
        
       al.add(characters.getData().toString());
                
      }
    }
    
    System.out.println("al size: " + al.size());
   // System.out.println("al: " + al.toString());

    int j =0;
    for(int i=0;i <al.size()-1; i = i+ 8){
        HashMap<String,String> hm=new HashMap<String,String>();  
        hm.put( "ID", 		al.get(0).toString());
        hm.put( "DomainURL", 	al.get(1).toString());
        hm.put( "rssfeedURL", 	al.get(2).toString());
        hm.put( "ArticleURL",	al.get(3).toString());
        hm.put( "Heading", 	al.get(4).toString());
        hm.put( "time_cap", 	al.get(5).toString());
        hm.put( "image", 	al.get(6).toString());
        hm.put( "text", 	al.get(7).toString());
        hm.put( "No", 		Integer.toString(j));
        j++;
        aList.add(hm);
    }
           System.out.println( aList.toString());
  }
}

        


