package NetPritam;


import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class emailattach {
	
	// plz Access for less secure apps	Turn on @ https://www.google.com/settings/security/lesssecureapps
    
	/*private static String USER_NAME = "pritamkhose@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "pritam@4"; // GMail password
    private static String RECIPIENT = "pritamkhose@gmail.com";*/

    public static void main(String[] args) {
   	 String from = "pritamkhose@gmail.com";  // GMail user name (just the part before "@gmail.com")
     String pass = "pritam@4"; // GMail password
     String[] to = {"pritamkhose@gmail.com"};
    // list of recipient email addresses
        String subject = "Java send mail Pritam";
        String body = "Welcome to Pritam!";
        String fileattach = "myupload.docx";

        sendFromGMail(from, pass, to, subject, body, fileattach);
    }

    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body,String fileattach) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        
        //2) compose message     
        try{  
          //MimeMessage message = new MimeMessage(session);  
          message.setFrom(new InternetAddress(from));  
          message.addRecipient(Message.RecipientType.TO,new InternetAddress(to[0]));  
          message.setSubject(subject);  
            
          //3) create MimeBodyPart object and set your message text     
          BodyPart messageBodyPart1 = new MimeBodyPart();  
          messageBodyPart1.setText(body);//"This is message body");  
            
          //4) create new MimeBodyPart object and set DataHandler object to this object      
          MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
        
          DataSource source = new FileDataSource(fileattach);  
          messageBodyPart2.setDataHandler(new DataHandler(source));  
          messageBodyPart2.setFileName(fileattach);  
           
           
          //5) create Multipart object and add MimeBodyPart objects to this object      
          Multipart multipart = new MimeMultipart();  
          multipart.addBodyPart(messageBodyPart1);  
          multipart.addBodyPart(messageBodyPart2);  
        
          //6) set the multiplart object to the message object  
          message.setContent(multipart );  
           
          //7) send message  
          Transport.send(message);  
         
         System.out.println("email sent....");  
         }catch (MessagingException ex) {ex.printStackTrace();}  
        
        
        
        /*
        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            DataSource source = new FileDataSource(fileattach);  
            //messageBodyPart2.setDataHandler(new DataHandler(source));  
            //messageBodyPart2.setFileName(filename);  
            
            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            
            System.out.println("email sent....");  
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }*/
    }
}