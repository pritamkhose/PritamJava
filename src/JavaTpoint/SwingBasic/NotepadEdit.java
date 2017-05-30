package SwingBasic;
/*
The JProgressBar class is used to display the progress of the task.

Commonly used Constructors of JProgressBar class:

JProgressBar(): is used to create a horizontal progress bar but no string text.
JProgressBar(int min, int max): is used to create a horizontal progress bar with the specified minimum and maximum value.
JProgressBar(int orient): is used to create a progress bar with the specified orientation, it can be either Vertical or Horizontal by using SwingConstants.VERTICAL and SwingConstants.HORIZONTAL constants.
JProgressBar(int orient, int min, int max): is used to create a progress bar with the specified orientation, minimum and maximum value.
Commonly used methods of JProgressBar class:

1) public void setStringPainted(boolean b): is used to determine whether string should be displayed.
2) public void setString(String s): is used to set value to the progress string.
3) public void setOrientation(int orientation): is used to set the orientation, it may be either vertical or horizontal by using SwingConstants.VERTICAL and SwingConstants.HORIZONTAL constants..
4) public void setValue(int value): is used to set the current value on the progress bar.
Example of JProgressBar class:*/

import javax.swing.*;  
import java.awt.event.*;  
  
public class NotepadEdit implements ActionListener{  
JFrame f;  
JMenuBar mb;  
JMenu file,edit,help;  
JMenuItem cut,copy,paste,selectAll;  
JTextArea ta;  
      
NotepadEdit(){  
f=new JFrame();  
  
cut=new JMenuItem("cut");  
copy=new JMenuItem("copy");  
paste=new JMenuItem("paste");  
selectAll=new JMenuItem("selectAll");  
  
cut.addActionListener(this);  
copy.addActionListener(this);  
paste.addActionListener(this);  
selectAll.addActionListener(this);  
  
mb=new JMenuBar();  
mb.setBounds(5,5,400,40);  
  
file=new JMenu("File");  
edit=new JMenu("Edit");  
help=new JMenu("Help");  
  
edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);  
  
  
mb.add(file);mb.add(edit);mb.add(help);  
  
ta=new JTextArea();  
ta.setBounds(5,30,460,460);  
  
f.add(mb);f.add(ta);  
  
f.setLayout(null);  
f.setSize(500,500);  
f.setVisible(true);  
}  
  
public void actionPerformed(ActionEvent e) {  
if(e.getSource()==cut)  
ta.cut();  
if(e.getSource()==paste)  
ta.paste();  
if(e.getSource()==copy)  
ta.copy();  
if(e.getSource()==selectAll)  
ta.selectAll();  
}  
  
public static void main(String[] args) {  
    new NotepadEdit();  
}  
}