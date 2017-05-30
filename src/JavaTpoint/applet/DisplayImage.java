package applet;

import java.applet.Applet;  
import java.awt.*;  
  
import java.awt.*;  
import java.applet.*;  
  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"pic_mountain.jpg");  
  }  
    

  public void paint(Graphics g) {  
	  // Display Image
	  g.drawImage(picture, 30,30, this);  
    
    
	  // Animation Image
    for(int i=0;i<500;i++){  
        g.drawImage(picture, i,30, this);  
    
        try{Thread.sleep(100);}catch(Exception e){}  
      }  
      
  }  
}