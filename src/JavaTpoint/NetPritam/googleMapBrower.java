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

public class googleMapBrower {


	public static void main(String[] a)throws Exception {
		
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