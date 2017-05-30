package NetPritam;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class LoadingWebPageToJEditorPane {

  /*public static void main(String[] a)throws Exception {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JEditorPane editorPane = new JEditorPane();

    editorPane.setPage(new URL("http://www.yahoo.com"));

    frame.add(new JScrollPane(editorPane));

    frame.setSize(800, 600);
    frame.setVisible(true);
  }*/
	
/*	public static void openWebpage(URI uri) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static void openWebpage(URL url) {
	    try {
	        openWebpage(url.toURI());
	    } catch (URISyntaxException e) {
	        e.printStackTrace();
	    }
	}*/

	public static void main(String[] a)throws Exception {
	/*  URL ur = new URL("http://www.google.com/");
	    HttpURLConnection yc =(HttpURLConnection) ur.openConnection();
	    BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	    String inputLine;
	    while ((inputLine = in.readLine()) != null) 
	    System.out.println(inputLine);
	    in.close();*/
		
		/*JEditorPane editorPane = new JEditorPane();
		editorPane.setPage(new URL("http://www.google.com"));*/
		
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  //URI oURL = new URI("http://www.yahoo.com");
			  
		/*https://www.google.co.in/maps/dir/Pune,+Maharashtra+411001/
		 * Ahmednagar,+Maharashtra+414001/@18.8070029,73.7426907,9z/
		 * am=t/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3bc2bf2e67461101:0x828d43bf9d9ee343!2m2!1d73.8567437!2d18.5204303!1m5!1m1!1s0x3bdcb05d46788921:0x6677e92c1a5181b6!2m2!1d74.7495916!2d19.0952075*/	  
			  String defaultURL="https://www.google.co.in/maps/?source=tldsi&hl=en";
			  String dirURL="https://www.google.co.in/maps/dir/";
			  String FromLoc = "Pune+Maharashtra";
			  String ToLoc = "Ahmednagar+Maharashtra";
			  //URI oURL = new URI(dirURL+FromLoc+"/"+ToLoc);
			  
			  String[] place = {"Hospital","petrol+station"};
			  String myLoc = "kedgaon+Ahmednagar";
			  String placeURL="https://www.google.co.in/maps/search/";
			  URI oURL = new URI(placeURL+place[1]+"+near+"+myLoc);
		
			
			  		
			  desktop.browse(oURL);
			} catch (Exception e) {
			  e.printStackTrace();
			}
	}
	

}