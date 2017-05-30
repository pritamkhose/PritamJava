package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.Graphics.*;

public class CheckerApplet extends Applet
{
   int squareSize = 50;// initialized to default size
   public void init () {}
   private void parseSquareSize (String param) {}
   private Color parseColor (String param) {}
   public void paint (Graphics g) {}


public void init ()
{
   String squareSizeParam = getParameter ("squareSize");
   parseSquareSize (squareSizeParam);
   String colorParam = getParameter ("color");
   Color fg = parseColor (colorParam);
   setBackground (Color.black);
   setForeground (fg);
}
private void parseSquareSize (String param)
{
   if (param == null) return;
   try {
      squareSize = Integer.parseInt (param);
   }
   catch (Exception e) {
     // Let default value remain
   }
}
}