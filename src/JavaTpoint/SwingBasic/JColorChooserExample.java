package SwingBasic;

/*
The JColorChooser class is used to create a color chooser dialog box so that user can select any color.
Commonly used Constructors of JColorChooser class:

JColorChooser(): is used to create a color chooser pane with white color initially.
JColorChooser(Color initialColor): is used to create a color chooser pane with the specified color initially.
Commonly used methods of JColorChooser class:

public static Color showDialog(Component c, String title, Color initialColor): is used to show the color-chooser dialog box.
Example of JColorChooser class:

JColorChooser example*/
import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
  
public class JColorChooserExample extends JFrame implements ActionListener{  
JButton b;  
Container c;  
  
JColorChooserExample(){  
    c=getContentPane();  
    c.setLayout(new FlowLayout());  
      
    b=new JButton("color");  
    b.addActionListener(this);  
      
    c.add(b);  
}  
  
public void actionPerformed(ActionEvent e) {  
Color initialcolor=Color.RED;  
Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);  
c.setBackground(color);  
}  
  
public static void main(String[] args) {  
    JColorChooserExample ch=new JColorChooserExample();  
    ch.setSize(400,400);  
    ch.setVisible(true);  
    ch.setDefaultCloseOperation(EXIT_ON_CLOSE);  
}  
} 