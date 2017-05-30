package javaMailAPIwork;
import java.io.IOException;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;

import com.sun.mail.pop3.POP3Store;  

/**
 *
 * @author Pritam
 */
public class SendMailSSL2 {
	 public static void main(String[] args) {  
		  //change accordingly
		 
		  String username = "pritamkhose";
	      String password = "pritam@4";
	      String to="pritamkhose@gmail.com";  
	      String from="pritamkhose@gmail.com"; 
	      String subject = "Hello Javamail API";
	      String msg  = "Hello, \n Regards,\n\t Pritam";
	    
	      SendMail(username,password,to,from,subject,msg);
	 }
  
	      public static void SendMail( String username, String password,
	    		  String to, String from, String subject, String msg	) {
	      //Get the session object  
		  Properties props = new Properties();  
		  props.put("mail.smtp.host", "smtp.gmail.com");  
		  props.put("mail.smtp.socketFactory.port", "465");  
		  props.put("mail.smtp.socketFactory.class",  
		            "javax.net.ssl.SSLSocketFactory");  
		  props.put("mail.smtp.auth", "true");  
		  props.put("mail.smtp.port", "465");  
		   
		  Session session = Session.getDefaultInstance(props,  
		   new javax.mail.Authenticator() {  
		   protected PasswordAuthentication getPasswordAuthentication() {  
		   return new PasswordAuthentication(username,password);//change accordingly  
		   }  
		  });  
		   
		  //compose message  
		  try {  
		   MimeMessage message = new MimeMessage(session);  
		   message.setFrom(new InternetAddress(from));//change accordingly  
		   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		   message.setSubject(subject);  
		   message.setText(msg);  
		     
		   //send message  
		   Transport.send(message);  
		  
		   System.out.println("message sent successfully");  
		   
		  } catch (MessagingException e) {throw new RuntimeException(e);}  
		   
	 }
}
