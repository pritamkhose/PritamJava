package SwingBasic;

import java.awt.event.*;  
import javax.swing.*;  
  
import javax.swing.*;  
public class Radio {  
JFrame f;  
  
Radio(){  
f=new JFrame();  
  
JRadioButton r1=new JRadioButton("A) Male");  
JRadioButton r2=new JRadioButton("B) FeMale");  
r1.setBounds(50,100,70,30);  
r2.setBounds(50,150,70,30);  
  
ButtonGroup bg=new ButtonGroup();  
bg.add(r1);bg.add(r2);  
  
f.add(r1);f.add(r2);  
  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Radio();  
}  
}  

/*
Commonly used Constructors of JRadioButton class:

JRadioButton(): creates an unselected radio button with no text.
JRadioButton(String s): creates an unselected radio button with specified text.
JRadioButton(String s, boolean selected): creates a radio button with the specified text and selected status.
Commonly used Methods of AbstractButton class:

1) public void setText(String s): is used to set specified text on button.
2) public String getText(): is used to return the text of the button.
3) public void setEnabled(boolean b): is used to enable or disable the button.
4) public void setIcon(Icon b): is used to set the specified Icon on the button.
5) public Icon getIcon(): is used to get the Icon of the button.
6) public void setMnemonic(int a): is used to set the mnemonic on the button.
7) public void addActionListener(ActionListener a): is used to add the action listener to this object.
*/