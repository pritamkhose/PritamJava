package XML.stax;

import java.util.List;

import XML.stax.Item;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		
			StaXParser read = new StaXParser();
		    List<Item> readConfig = read.readConfig("config.xml");
		    for (Item item : readConfig) {
		      System.out.println(item);
		    }
		    */
		    StaxWriter2 configFile = new StaxWriter2();
		    configFile.setFile("config2.xml");
		    try {
		      configFile.saveConfig();
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
	}

}
