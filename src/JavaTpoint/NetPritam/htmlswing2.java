package NetPritam;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.net.*;

	public class htmlswing2 {
	 public static void main(String args[]) {  
	  JTextPane tp = new JTextPane();
	  JScrollPane js = new JScrollPane();
	  js.getViewport().add(tp);
	  JFrame jf = new JFrame();
	  jf.getContentPane().add(js);
	  jf.pack();
	  jf.setSize(400,500);
	  jf.setVisible(true); 
	  
	  try {
	    URL url = new URL("http://www.google.com");
	    tp.setPage(url);
	    } 
	  catch (Exception e) {
	    e.printStackTrace();
	    }
	  }
	 }
