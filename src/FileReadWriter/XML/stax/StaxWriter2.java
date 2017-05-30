package XML.stax;

import java.io.FileOutputStream;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxWriter2 {
  private String configFile;

  public void setFile(String configFile) {
    this.configFile = configFile;
  }

  public void saveConfig() throws Exception {
    // create an XMLOutputFactory
    XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
    // create XMLEventWriter
    XMLEventWriter eventWriter = outputFactory
        .createXMLEventWriter(new FileOutputStream(configFile));
    // create an EventFactory
    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
    XMLEvent end = eventFactory.createDTD("\n");
    // create and write Start Tag
    StartDocument startDocument = eventFactory.createStartDocument();
    eventWriter.add(startDocument);

    // create config open tag
    StartElement configStartElement = eventFactory.createStartElement("",
        "", "News");
    eventWriter.add(configStartElement);
    eventWriter.add(end);
    
    // Write the different nodes
    createNode(eventWriter, "ID", "1");
    createNode(eventWriter, "DomainURL", "901");
    createNode(eventWriter, "rssfeedURL", "0");
    createNode(eventWriter, "ArticleURL", "0");
    createNode(eventWriter, "Heading", "901");
    createNode(eventWriter, "time_cap", "0");
    createNode(eventWriter, "image", "0");
    createNode(eventWriter, "text", "0");
    

    // Write the different nodes
    createNode(eventWriter, "ID", "2");
    createNode(eventWriter, "DomainURL", "901");
    createNode(eventWriter, "rssfeedURL", "0");
    createNode(eventWriter, "ArticleURL", "0");
    createNode(eventWriter, "Heading", "901");
    createNode(eventWriter, "time_cap", "0");
    createNode(eventWriter, "image", "0");
    createNode(eventWriter, "text", "0");
    
    eventWriter.add(eventFactory.createEndElement("", "", "config"));
    eventWriter.add(end);
    eventWriter.add(eventFactory.createEndDocument());
    eventWriter.close();
  }

  private void createNode(XMLEventWriter eventWriter, String name,
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