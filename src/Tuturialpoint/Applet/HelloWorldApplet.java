package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.Graphics.*;

public class HelloWorldApplet extends Applet
{
   public void paint (Graphics g)
   {
      g.drawString ("Hello World", 25, 50);
   }
}