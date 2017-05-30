package applet;

import java.applet.Applet;  
import java.awt.Graphics;  
public class First extends Applet{  
  
public void paint(Graphics g){  
g.drawString("welcome",50,50);  
}  
  
}  

/*
 In CMD -
Microsoft Windows [Version 10.0.10240]
(c) 2015 Microsoft Corporation. All rights reserved.

C:\Users\Pritam>E:

E:\>cd E:\Educational\Code\Java Workspace\javatpoint\bin\applet

E:\Educational\Code\Java Workspace\javatpoint\bin\applet>appletviewer First.java
I/O exception while reading: E:\Educational\Code\Java Workspace\javatpoint\bin\applet\First.java (The system cannot find the file specified)

E:\Educational\Code\Java Workspace\javatpoint\bin\applet>

*/