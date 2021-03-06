package SwingLayout;

import java.awt.*;  
import java.awt.event.*;  
  
import javax.swing.*;   
  
public class CardLayoutExample extends JFrame implements ActionListener{  
CardLayout card;  
JButton b1,b2,b3;  
Container c;  
    CardLayoutExample(){  
          
        c=getContentPane();  
        card=new CardLayout(40,30);  
//create CardLayout object with 40 hor space and 30 ver space  
        c.setLayout(card);  
          
        b1=new JButton("Apple");  
        b2=new JButton("Boy");  
        b3=new JButton("Cat");  
        b1.addActionListener((ActionListener) this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
              
        c.add("a",b1);c.add("b",b2);c.add("c",b3);  
                          
    }  
    public void actionPerformed(ActionEvent e) {  
    card.next(c);  
    }  
  
    public static void main(String[] args) {  
        CardLayoutExample cl=new CardLayoutExample();  
        cl.setSize(400,400);  
        cl.setVisible(true);  
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
}  

/*
Constructors of CardLayout class:

CardLayout(): creates a card layout with zero horizontal and vertical gap.
CardLayout(int hgap, int vgap): creates a card layout with the given horizontal and vertical gap.
Commonly used methods of CardLayout class:

public void next(Container parent): is used to flip to the next card of the given container.
public void previous(Container parent): is used to flip to the previous card of the given container.
public void first(Container parent): is used to flip to the first card of the given container.
public void last(Container parent): is used to flip to the last card of the given container.
public void show(Container parent, String name): is used to flip to the specified card with the given name.
*/