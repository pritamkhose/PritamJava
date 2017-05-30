package FileReadWriter.XML.tutorialspoint;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class CreateXmlFileDemo2 {
	
   public static void main(String argv[]) {

      try {
         DocumentBuilderFactory dbFactory =
         DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = 
            dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         // root element
         Element rootElement = doc.createElement("News ");
         doc.appendChild(rootElement);

         //  supercars element
         Element supercar = doc.createElement("Article");
         rootElement.appendChild(supercar);

         // setting attribute to element
         Attr attr = doc.createAttribute("TOI");
         attr.setValue("ID");
         supercar.setAttributeNode(attr);

         // ArticleDetail element
         Element ArticleDetail = doc.createElement("ArticleDetail");
         Attr attrType = doc.createAttribute("type");
         attrType.setValue("DomainURL");
         ArticleDetail.setAttributeNode(attrType);
         ArticleDetail.appendChild(
         doc.createTextNode("Ferrari 101"));
         supercar.appendChild(ArticleDetail);

         Element carname1 = doc.createElement("ArticleDetail");
         Attr attrType1 = doc.createAttribute("type");
         attrType1.setValue("rssfeedURL");
         carname1.setAttributeNode(attrType1);
         carname1.appendChild(
         doc.createTextNode("Ferrari 202"));
         supercar.appendChild(carname1);
         
         Element carname2 = doc.createElement("ArticleDetail");
         Attr attrType2 = doc.createAttribute("type");
         attrType2.setValue("ArticleURL");
         carname2.setAttributeNode(attrType1);
         carname2.appendChild(
         doc.createTextNode("Ferrari 202"));
         supercar.appendChild(carname1);
         
         Element carname3 = doc.createElement("ArticleDetail");
         Attr attrType3 = doc.createAttribute("type");
         attrType3.setValue("Heading");
         carname3.setAttributeNode(attrType1);
         carname3.appendChild(
         doc.createTextNode("Ferrari heading"));
         supercar.appendChild(carname1);

         
         Element carname4 = doc.createElement("ArticleDetail");
         Attr attrType4 = doc.createAttribute("type");
         attrType4.setValue("time_cptn");
         carname4.setAttributeNode(attrType1);
         carname4.appendChild(
         doc.createTextNode("Ferrari time"));
         supercar.appendChild(carname1);
         
         Element carname5 = doc.createElement("ArticleDetail");
         Attr attrType5 = doc.createAttribute("type");
         attrType5.setValue("image");
         carname5.setAttributeNode(attrType1);
         carname5.appendChild(
         doc.createTextNode("Ferrari image"));
         supercar.appendChild(carname1);
         
         Element carname6 = doc.createElement("ArticleDetail");
         Attr attrType6 = doc.createAttribute("type");
         attrType6.setValue("NormalText");
         carname6.setAttributeNode(attrType1);
         carname6.appendChild(
         doc.createTextNode("Normal Text"));
         supercar.appendChild(carname1);
         
         // write the content into xml file
         TransformerFactory transformerFactory =
         TransformerFactory.newInstance();
         Transformer transformer =
         transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result =
         new StreamResult(new File("TOI_news.xml"));
         transformer.transform(source, result);
         // Output to console for testing
         StreamResult consoleResult =
         new StreamResult(System.out);
         transformer.transform(source, consoleResult);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   
   private void createTextNode(XMLEventWriter eventWriter, String name,
		      String value) throws XMLStreamException {

		    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		    XMLEvent end = eventFactory.createDTD("\n");
		    XMLEvent tab = eventFactory.createDTD("\t");
		    // create Start node
		    StartElement sElement = eventFactory.createStartElement("", "", name);
		    eventWriter.add(tab);
		    eventWriter.add(sElement);
		    // create Content
		    Characters characters = eventFactory.createCharacters(value);
		    eventWriter.add(characters);
		    // create End node
		    EndElement eElement = eventFactory.createEndElement("", "", name);
		    eventWriter.add(eElement);
		    eventWriter.add(end);

		  }
}
