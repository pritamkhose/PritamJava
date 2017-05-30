package AWTGUI;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class AwtControlDemo {

   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtControlDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtControlDemo  awtControlDemo1 = new AwtControlDemo();
      awtControlDemo1.showLabelDemo();      
      AwtControlDemo  awtControlDemo2 = new AwtControlDemo();
      awtControlDemo2.showButtonDemo(); 
      AwtControlDemo  awtControlDemo3 = new AwtControlDemo();
      awtControlDemo3.showCheckBoxDemo(); 
      AwtControlDemo  awtControlDemo4 = new AwtControlDemo();
      awtControlDemo4.showCheckBoxGroupDemo(); 
      AwtControlDemo  awtControlDemo5 = new AwtControlDemo();
      awtControlDemo5.showListDemo(); 
      AwtControlDemo  awtControlDemo6 = new AwtControlDemo();
      awtControlDemo6.showTextFieldDemo();
      
      AwtControlDemo  awtControlDemo7 = new AwtControlDemo();
      awtControlDemo7.showTextAreaDemo();
      AwtControlDemo  awtControlDemo8 = new AwtControlDemo();
      awtControlDemo8.showChoiceDemo();
      AwtControlDemo  awtControlDemo9 = new AwtControlDemo();
      awtControlDemo9.showCanvasDemo();
      AwtControlDemo  awtControlDemo10 = new AwtControlDemo();
    //  awtControlDemo10.showImageDemo();
      AwtControlDemo  awtControlDemo11 = new AwtControlDemo();
      awtControlDemo11.showScrollbarDemo();
      AwtControlDemo  awtControlDemo12 = new AwtControlDemo();
      awtControlDemo12.showDialogDemo();
      AwtControlDemo  awtControlDemo13 = new AwtControlDemo();
      awtControlDemo13.showFileDialogDemo();
      AwtControlDemo  awtControlDemo14 = new AwtControlDemo();
      awtControlDemo14.showActionListenerDemo();
      
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });   
      
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showLabelDemo(){
      headerLabel.setText("Control in action: Label");      

      Label label = new Label();
      label.setText("Welcome to TutorialsPoint AWT Tutorial.");
      label.setAlignment(Label.CENTER);
      label.setBackground(Color.GRAY);
      label.setForeground(Color.WHITE);
      controlPanel.add(label);
   
      mainFrame.setVisible(true);  
   }
   
   
   private void showButtonDemo(){
	      headerLabel.setText("Control in action: Button"); 

	      Button okButton = new Button("OK");
	      Button submitButton = new Button("Submit");
	      Button cancelButton = new Button("Cancel");

	      okButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            statusLabel.setText("Ok Button clicked.");
	         }
	      });

	      submitButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            statusLabel.setText("Submit Button clicked.");
	         }
	      });

	      cancelButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            statusLabel.setText("Cancel Button clicked.");
	         }
	      });
	      controlPanel.add(okButton);
	      controlPanel.add(submitButton);
	      controlPanel.add(cancelButton);       

	      mainFrame.setVisible(true);  
	   }
   
  
   private void showCheckBoxDemo(){

	      headerLabel.setText("Control in action: CheckBox"); 

	      Checkbox chkApple = new Checkbox("Apple");
	      Checkbox chkMango = new Checkbox("Mango");
	      Checkbox chkPeer = new Checkbox("Peer");


	      chkApple.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {             
	            statusLabel.setText("Apple Checkbox: " 
	            + (e.getStateChange()==1?"checked":"unchecked"));
	         }
	      });

	      chkMango.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            statusLabel.setText("Mango Checkbox: " 
	            + (e.getStateChange()==1?"checked":"unchecked"));
	         }
	      });

	      chkPeer.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            statusLabel.setText("Peer Checkbox: " 
	            + (e.getStateChange()==1?"checked":"unchecked"));
	         }
	      });

	      controlPanel.add(chkApple);
	      controlPanel.add(chkMango);
	      controlPanel.add(chkPeer);       

	      mainFrame.setVisible(true);  
	   }
   
   private void showCheckBoxGroupDemo(){
	    
	      headerLabel.setText("Control in action: CheckBoxGroup"); 

	      CheckboxGroup fruitGroup = new CheckboxGroup();

	      Checkbox chkApple = new Checkbox("Apple",fruitGroup,true);
	      Checkbox chkMango = new Checkbox("Mango",fruitGroup,false);
	      Checkbox chkPeer = new Checkbox("Peer",fruitGroup,false);

	      statusLabel.setText("Apple Checkbox: checked");
	      chkApple.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {             
	            statusLabel.setText("Apple Checkbox: checked");
	         }
	      });

	      chkMango.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            statusLabel.setText("Mango Checkbox: checked");
	         }
	      });

	      chkPeer.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	            statusLabel.setText("Peer Checkbox: checked");
	         }
	      });

	      controlPanel.add(chkApple);
	      controlPanel.add(chkMango);   
	      controlPanel.add(chkPeer);       

	      mainFrame.setVisible(true);  
	   }
    
   private void showListDemo(){                                       

	      headerLabel.setText("Control in action: List"); 
	      final List fruitList = new List(4,false);

	      fruitList.add("Apple");
	      fruitList.add("Grapes");
	      fruitList.add("Mango");
	      fruitList.add("Peer");

	      final List vegetableList = new List(4,true);
	   
	      vegetableList.add("Lady Finger");
	      vegetableList.add("Onion");
	      vegetableList.add("Potato");
	      vegetableList.add("Tomato");

	      Button showButton = new Button("Show");

	      showButton.addActionListener(new ActionListener() {

	         public void actionPerformed(ActionEvent e) {     
	            String data = "Fruits Selected: " 
	               + fruitList.getItem(fruitList.getSelectedIndex());
	            data += ", Vegetables selected: ";
	            for(String vegetable:vegetableList.getSelectedItems()){
	               data += vegetable + " ";
	            }
	            statusLabel.setText(data);
	         }
	      }); 

	      controlPanel.add(fruitList);
	      controlPanel.add(vegetableList);
	      controlPanel.add(showButton);

	      mainFrame.setVisible(true);  
	   }
   
   private void showTextFieldDemo(){
	      headerLabel.setText("Control in action: TextField"); 

	      Label  namelabel= new Label("User ID: ", Label.RIGHT);
	      Label  passwordLabel = new Label("Password: ", Label.CENTER);
	      final TextField userText = new TextField(6);
	      final TextField passwordText = new TextField(6);
	      passwordText.setEchoChar('*');

	      Button loginButton = new Button("Login");
	   
	      loginButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {     
	            String data = "Username: " + userText.getText();
	            data += ", Password: " + passwordText.getText();
	            statusLabel.setText(data);        
	         }
	      }); 

	      controlPanel.add(namelabel);
	      controlPanel.add(userText);
	      controlPanel.add(passwordLabel);       
	      controlPanel.add(passwordText);
	      controlPanel.add(loginButton);
	      mainFrame.setVisible(true);  
	   }
   
   private void showTextAreaDemo(){
	      headerLabel.setText("Control in action: TextArea"); 

	      Label  commentlabel= new Label("Comments: ", Label.RIGHT);

	      final TextArea commentTextArea = new TextArea("This is a AWT tutorial "
	      +"to make GUI application in Java.",5,30);

	      Button showButton = new Button("Show");

	      showButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {     
	            statusLabel.setText( commentTextArea.getText());        
	         }
	      }); 

	      controlPanel.add(commentlabel);
	      controlPanel.add(commentTextArea);        
	      controlPanel.add(showButton);
	      mainFrame.setVisible(true);  
	   }
   
   
   private void showChoiceDemo(){                                       

	      headerLabel.setText("Control in action: Choice"); 
	      final Choice fruitChoice = new Choice();

	      fruitChoice.add("Apple");
	      fruitChoice.add("Grapes");
	      fruitChoice.add("Mango");
	      fruitChoice.add("Peer");

	      Button showButton = new Button("Show");

	      showButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {     
	            String data = "Fruit Selected: " 
	            + fruitChoice.getItem(fruitChoice.getSelectedIndex());
	            statusLabel.setText(data);
	         }
	      }); 

	      controlPanel.add(fruitChoice);
	      controlPanel.add(showButton);

	      mainFrame.setVisible(true);  
	   }
   
   
   private void showCanvasDemo(){
	      headerLabel.setText("Control in action: Canvas"); 

	      controlPanel.add(new MyCanvas());
	      mainFrame.setVisible(true);  
	   } 

	   class MyCanvas extends Canvas {

	      public MyCanvas () {
	         setBackground (Color.GRAY);
	         setSize(300, 300);
	      }

	      public void paint (Graphics g) {
	         Graphics2D g2;
	         g2 = (Graphics2D) g;
	         g2.drawString ("It is a custom canvas area", 70, 70);
	      }
	   }
	   
	/*   private void showImageDemo(){
		      headerLabel.setText("Control in action: Image"); 

		      controlPanel.add(new ImageComponent("resources/java.jpg"));
		      mainFrame.setVisible(true);  
		   }
			
		   class ImageComponent extends Component {

		      BufferedImage img;

		      public void paint(Graphics g) {
		         g.drawImage(img, 0, 0, null);
		      }

		      public ImageComponent(String path) {
		         try {
		            img = ImageIO.read(new File(path));
		         } catch (IOException e) {
		            e.printStackTrace();
		         }
		      }

		      public Dimension getPreferredSize() {
		         if (img == null) {
		            return new Dimension(100,100);
		         } else {
		            return new Dimension(img.getWidth(), img.getHeight());
		         }
		      }
		   }   */
	   
	   private void showScrollbarDemo(){                                       
		      headerLabel.setText("Control in action: Scrollbar"); 

		      final Scrollbar horizontalScroller = new Scrollbar(Scrollbar.HORIZONTAL);
		      final Scrollbar verticalScroller = new Scrollbar();
		      verticalScroller.setOrientation(Scrollbar.VERTICAL);
		      horizontalScroller.setMaximum (100);
		      horizontalScroller.setMinimum (1);
		      verticalScroller.setMaximum (100);
		      verticalScroller.setMinimum (1);

		      horizontalScroller.addAdjustmentListener(new AdjustmentListener() {

		         @Override
		         public void adjustmentValueChanged(AdjustmentEvent e) {
		            statusLabel.setText("Horozontal: "
		               +horizontalScroller.getValue() 
		               +" ,Vertical: "
		               + verticalScroller.getValue());
		            }
		         });

		      verticalScroller.addAdjustmentListener(new AdjustmentListener() {

		            @Override
		            public void adjustmentValueChanged(AdjustmentEvent e) {
		               statusLabel.setText("Horozontal: "
		               +horizontalScroller.getValue() 
		               +" ,Vertical: "+ verticalScroller.getValue());
		            }
		         });

		      controlPanel.add(horizontalScroller);
		      controlPanel.add(verticalScroller);

		      mainFrame.setVisible(true);  
		   }
	   
   
	   private void showDialogDemo(){
		      headerLabel.setText("Control in action: Dialog"); 
		      Button showAboutDialogButton = new Button("Show About Dialog");
		      showAboutDialogButton.addActionListener(new ActionListener() {
			     @Override
		         public void actionPerformed(ActionEvent e) {
		            AboutDialog aboutDialog = new AboutDialog(mainFrame);
		            aboutDialog.setVisible(true);
		         }
		      });

		      controlPanel.add(showAboutDialogButton);
		      mainFrame.setVisible(true);  
		   }

		   class AboutDialog extends Dialog {
		      public AboutDialog(Frame parent){
		         super(parent, true);         
		         setBackground(Color.gray);
		         setLayout(new BorderLayout());
		         Panel panel = new Panel();
		         panel.add(new Button("Close"));
		         add("South", panel);
		         setSize(200,200);

		         addWindowListener(new WindowAdapter() {
		            public void windowClosing(WindowEvent windowEvent){
		               dispose();
		            }
		         });
		      }

		      public boolean action(Event evt, Object arg){
		         if(arg.equals("Close")){
		            dispose();
		            return true;
		         }
		         return false;
		      }

		      public void paint(Graphics g){
		         g.setColor(Color.white);
		         g.drawString("TutorialsPoint.Com", 25,70 );
		         g.drawString("Version 1.0", 60, 90);      
		      }
		   }
		   
		   private void showFileDialogDemo(){
			      headerLabel.setText("Control in action: FileDialog"); 

			      final FileDialog fileDialog = new FileDialog(mainFrame,"Select file");
			      Button showFileDialogButton = new Button("Open File");
			      showFileDialogButton.addActionListener(new ActionListener() {
			         @Override
			         public void actionPerformed(ActionEvent e) {
			            fileDialog.setVisible(true);
			            statusLabel.setText("File Selected :" 
			            + fileDialog.getDirectory() + fileDialog.getFile());
			         }
			      });

			      controlPanel.add(showFileDialogButton);
			      mainFrame.setVisible(true);  
			   }
		   
		   
		   private void showActionListenerDemo(){
			      headerLabel.setText("Listener in action: ActionListener");      

			      ScrollPane panel = new ScrollPane();      
			      panel.setBackground(Color.magenta);            

			      Button okButton = new Button("OK");

			      okButton.addActionListener(new CustomActionListener());        
			      panel.add(okButton);
			      controlPanel.add(panel);

			      mainFrame.setVisible(true); 
			   }

			   class CustomActionListener implements ActionListener{

			      public void actionPerformed(ActionEvent e) {
			         statusLabel.setText("Ok Button Clicked.");
			      }
			   }
}