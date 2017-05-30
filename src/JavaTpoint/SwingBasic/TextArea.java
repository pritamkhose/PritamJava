package SwingBasic;

import java.awt.Color;  
import javax.swing.*;  
  
public class TextArea {  
    JTextArea area;  
    JFrame f;  
    TextArea(){  
    f=new JFrame();  
          
    area=new JTextArea(300,300);  
    area.setBounds(10,30,300,300);  
      
    area.setBackground(Color.black);  
    area.setForeground(Color.white);  
          
    f.add(area);  
      
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
    public static void main(String[] args) {  
        new TextArea();  
    }  
}  

/*
The JTextArea class is used to create a text area. It is a multiline area that displays the plain text only.

Commonly used Constructors:

JTextArea(): creates a text area that displays no text initially.
JTextArea(String s): creates a text area that displays specified text initially.
JTextArea(int row, int column): creates a text area with the specified number of rows and columns that displays no text initially..
JTextArea(String s, int row, int column): creates a text area with the specified number of rows and columns that displays specified text.
Commonly used methods of JTextArea class:

1) public void setRows(int rows): is used to set specified number of rows.
2) public void setColumns(int cols):: is used to set specified number of columns.
3) public void setFont(Font f): is used to set the specified font.
4) public void insert(String s, int position): is used to insert the specified text on the specified position.
5) public void append(String s): is used to append the given text to the end of the document.
*/