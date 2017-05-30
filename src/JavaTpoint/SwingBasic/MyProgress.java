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
public class MyProgress extends JFrame{  
JProgressBar jb;  
int i=0,num=0;  
  
MyProgress(){  
jb=new JProgressBar(0,2000);  
jb.setBounds(40,40,200,30);  
      
jb.setValue(0);  
jb.setStringPainted(true);  
      
add(jb);  
setSize(400,400);  
setLayout(null);  
}  
  
public void iterate(){  
while(i<=2000){  
  jb.setValue(i);  
  i=i+20;  
  try{Thread.sleep(150);}catch(Exception e){}  
}  
}  
public static void main(String[] args) {  
    MyProgress m=new MyProgress();  
    m.setVisible(true);  
    m.iterate();  
}  
}  