package NetPritam;

import java.awt.BorderLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class htmlswing1 {
  public static void main(String[] argv) throws Exception{
    String url = "http://www.google.co.in";
    JEditorPane editorPane = new JEditorPane(url);
    editorPane.setEditable(false);

    JFrame frame = new JFrame();
    frame.getContentPane().add(editorPane, BorderLayout.CENTER);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}