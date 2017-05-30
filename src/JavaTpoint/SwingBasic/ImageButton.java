package SwingBasic;

import java.awt.event.*;  
import javax.swing.*;  
  
public class ImageButton{  
ImageButton(){  
JFrame f=new JFrame();  
                  
          
JButton b=new JButton(new ImageIcon("b.jpg"));  
b.setBounds(130,100,100, 40);  
      
f.add(b);  
          
f.setSize(300,400);  
f.setLayout(null);  
f.setVisible(true);  
          
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
    }  
      
public static void main(String[] args) {  
    new ImageButton();  
}  
}  

/*
Commonly used Constructors:

JButton(): creates a button with no text and icon.
JButton(String s): creates a button with the specified text.
JButton(Icon i): creates a button with the specified icon object.
Commonly used Methods of AbstractButton class:

1) public void setText(String s): is used to set specified text on button.
2) public String getText(): is used to return the text of the button.
3) public void setEnabled(boolean b): is used to enable or disable the button.
4) public void setIcon(Icon b): is used to set the specified Icon on the button.
5) public Icon getIcon(): is used to get the Icon of the button.
6) public void setMnemonic(int a): is used to set the mnemonic on the button.
7) public void addActionListener(ActionListener a): is used to add the action listener to this object.
*/