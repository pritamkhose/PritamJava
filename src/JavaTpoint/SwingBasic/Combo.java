package SwingBasic;

import javax.swing.*;  
public class Combo {  
JFrame f;  
Combo(){  
    f=new JFrame("Combo ex");  
      
    String country[]={"India","Aus","U.S.A","England","Newzeland"};  
      
    JComboBox cb=new JComboBox(country);  
    cb.setBounds(50, 50,90,20);  
    f.add(cb);  
      
    f.setLayout(null);  
    f.setSize(400,500);  
    f.setVisible(true);  
      
}  
public static void main(String[] args) {  
    new Combo();  
      
}  
}  

/*
Commonly used Constructors of JComboBox class:

JComboBox()
JComboBox(Object[] items)
JComboBox(Vector<?> items)
Commonly used methods of JComboBox class:

1) public void addItem(Object anObject): is used to add an item to the item list.
2) public void removeItem(Object anObject): is used to delete an item to the item list.
3) public void removeAllItems(): is used to remove all the items from the list.
4) public void setEditable(boolean b): is used to determine whether the JComboBox is editable.
5) public void addActionListener(ActionListener a): is used to add the ActionListener.
6) public void addItemListener(ItemListener i): is used to add the ItemListener.
*/