package NetPritam;



import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import javax.mail.Folder;
import javax.mail.NoSuchProviderException;
import javax.mail.Store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import javax.mail.Quota;
import com.sun.mail.imap.IMAPStore;


public class AllEmail {
    
	public static void main(String[] args) {
		
	     String username = "pritamkhose";//change accordingly
	     String password = "pritam@4";//change accordingly
	    // Assuming you are sending email through
	     String host = "smtp.gmail.com"; 

		// Recipient's email ID needs to be mentioned.
		   String to = "pritamkhose@gmail.com";
		   // Sender's email ID needs to be mentioned
		   String from = "p.khose@gmail.com";
		   String subject = "Testing Subject";
		   String body = "This is message body";
		   String body1 = "Hello\n, this is sample for to check send email using JavaMailAPI ";
		   String filename = "myupload.docx";
		   String mailStoreType = "pop3";
		   String pop3host = "pop.gmail.com";
		   String imaphost = "imap.gmail.com";
		   
	  //SendEmail(host, username, password,to, from,subject,body,filename);
      
	  //SendEmailUsingGMailSMTP(host, username, password,to, from,subject,body1,filename);
		      
      //CheckingMails(host, username, password);
      
      //ReplyToEmail(host, pop3host, username, password);
      
      //ForwardEmail(host, pop3host, username, password);
		   
	  //DeleteEmail(pop3host, mailStoreType, username, password);
		   
	  //QuotaManagement(imaphost, username, password);
   }
   
   public static void SendEmail(String host,String username,String password,
		   String to, String from, String subject, String body, String filename) { 
   
   Properties props = new Properties();
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.starttls.enable", "true");
   props.put("mail.smtp.host", host);
   props.put("mail.smtp.port", "25");
   

   // Get the Session object.
   Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

   try {
      // Create a default MimeMessage object.
      Message message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(from));

      // Set To: header field of the header.
      message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

      // Set Subject: header field
      message.setSubject(subject);

      // Create the message part
      BodyPart messageBodyPart = new MimeBodyPart();

      // Now set the actual message
      messageBodyPart.setText(body);

      // Create a multipar message
      Multipart multipart = new MimeMultipart();

      // Set text message part
      multipart.addBodyPart(messageBodyPart);

      // Part two is attachment
      messageBodyPart = new MimeBodyPart();
      DataSource source = new FileDataSource(filename);
      messageBodyPart.setDataHandler(new DataHandler(source));
      messageBodyPart.setFileName(filename);
      multipart.addBodyPart(messageBodyPart);

      // Send the complete message parts
      message.setContent(multipart);

      // Send message
      Transport.send(message);

      System.out.println("Sent email successfully....");

   } catch (MessagingException e) {
      throw new RuntimeException(e);
   }
}

   
   public static void CheckingMails(String host,String username,String password) {  
	   
		      try {

		      //create properties field
		      Properties properties = new Properties();

		      properties.put("mail.pop3.host", host);
		      properties.put("mail.pop3.port", "995");
		      properties.put("mail.pop3.starttls.enable", "true");
		      Session emailSession = Session.getDefaultInstance(properties);
		  
		      //create the POP3 store object and connect with the pop server
		      Store store = emailSession.getStore("pop3s");

		      store.connect(host, username, password);

		      //create the folder object and open it
		      Folder emailFolder = store.getFolder("INBOX");
		      emailFolder.open(Folder.READ_ONLY);

		      // retrieve the messages from the folder in an array and print it
		      Message[] messages = emailFolder.getMessages();
		      System.out.println("No. of Email in Inbox---" + messages.length);

		      for (int i = 0, n = messages.length; i < n; i++) {
		         Message message = messages[i];
		         System.out.println("---------------------------------");
		         System.out.println("Email Number " + (i + 1));
		         System.out.println("Subject: " + message.getSubject());
		         System.out.println("From: " + message.getFrom()[0]);
		         System.out.println("Text: " + message.getContent().toString());

		      }

		      //close the store and folder objects
		      emailFolder.close(false);
		      store.close();

		      } catch (NoSuchProviderException e) {
		         e.printStackTrace();
		      } catch (MessagingException e) {
		         e.printStackTrace();
		      } catch (Exception e) {
		         e.printStackTrace();
		      }
		   }

   
   public static void ReplyToEmail(String host, String pop3host, String username,String password) {
	   {
	      Date date = null;

	      Properties properties = new Properties();
	      properties.put("mail.store.protocol", "pop3");
	      properties.put("mail.pop3s.host", pop3host);
	      properties.put("mail.pop3s.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.host", host); 
	      properties.put("mail.smtp.port", "25");
	      Session session = Session.getDefaultInstance(properties);

	      // session.setDebug(true);
	      try 
	      {
	         // Get a Store object and connect to the current host
	         Store store = session.getStore("pop3s");
	         //change the user and password accordingly
	         store.connect(host, username, password);
	         
	         Folder folder = store.getFolder("inbox");
	         if (!folder.exists()) {
	            System.out.println("inbox not found");
	               System.exit(0);
	         }
	         folder.open(Folder.READ_ONLY);

	         BufferedReader reader = new BufferedReader(new InputStreamReader(
	            System.in));

	         Message[] messages = folder.getMessages();
	         if (messages.length != 0) {

	            for (int i = 0, n = messages.length; i < n; i++) {
	               Message message = messages[i];
	               date = message.getSentDate();
	               // Get all the information from the message
	               String from = InternetAddress.toString(message.getFrom());
	               if (from != null) {
	                  System.out.println("From: " + from);
	               }
	               String replyTo = InternetAddress.toString(message
		         .getReplyTo());
	               if (replyTo != null) {
	                  System.out.println("Reply-to: " + replyTo);
	               }
	               String to = InternetAddress.toString(message
		         .getRecipients(Message.RecipientType.TO));
	               if (to != null) {
	                  System.out.println("To: " + to);
	               }

	               String subject = message.getSubject();
	               if (subject != null) {
	                  System.out.println("Subject: " + subject);
	               }
	               Date sent = message.getSentDate();
	               if (sent != null) {
	                  System.out.println("Sent: " + sent);
	               }

	               System.out.print("Do you want to reply [y/n] : ");
	               String ans = reader.readLine();
	               if ("Y".equals(ans) || "y".equals(ans)) {

	                  Message replyMessage = new MimeMessage(session);
	                  replyMessage = (MimeMessage) message.reply(false);
	                  replyMessage.setFrom(new InternetAddress(to));
	                  replyMessage.setText("Thanks");
	                  replyMessage.setReplyTo(message.getReplyTo());

	                  // Send the message by authenticating the SMTP server
	                  // Create a Transport instance and call the sendMessage
	                  Transport t = session.getTransport("smtp");
	                  try {
		   	     //connect to the smpt server using transport instance
			     //change the user and password accordingly	
		             t.connect(username, password);
		             t.sendMessage(replyMessage,
	                        replyMessage.getAllRecipients());
	                  } finally {
	                     t.close();
	                  }
	                  System.out.println("message replied successfully ....");

	                  // close the store and folder objects
	                  folder.close(false);
	                  store.close();

	               } else if ("n".equals(ans)) {
	                  break;
	               }
	            }//end of for loop

	         } else {
	            System.out.println("There is no msg....");
	         }

	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	}
   

   public static void ForwardEmail(String host, String pop3host, String username,String password) {
	      Properties properties = new Properties();
	      properties.put("mail.store.protocol", "pop3");
	      properties.put("mail.pop3s.host", pop3host);
	      properties.put("mail.pop3s.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.host", host);
	      properties.put("mail.smtp.port", "25");
	      Session session = Session.getDefaultInstance(properties);
	      try {
	         // session.setDebug(true);
	         // Get a Store object and connect to the current host
	         Store store = session.getStore("pop3s");
	         //change the user and password accordingly
	         store.connect(host, username, password);
	         
	         // Create a Folder object and open the folder
	         Folder folder = store.getFolder("inbox");
	         folder.open(Folder.READ_ONLY);
	         BufferedReader reader = new BufferedReader(new InputStreamReader(
	            System.in));
	         Message[] messages = folder.getMessages();
	         if (messages.length != 0) {

	         for (int i = 0, n = messages.length; i < n; i++) {
	            Message message = messages[i];
	            // Get all the information from the message
	            String from = InternetAddress.toString(message.getFrom());
	            if (from != null) {
	               System.out.println("From: " + from);
	            }
	            String replyTo = InternetAddress.toString(message
	               .getReplyTo());
	            if (replyTo != null) {
	               System.out.println("Reply-to: " + replyTo);
	            }
	            String to = InternetAddress.toString(message
	               .getRecipients(Message.RecipientType.TO));
	            if (to != null) {
	               System.out.println("To: " + to);
	            }

	            String subject = message.getSubject();
	            if (subject != null) {
	               System.out.println("Subject: " + subject);
	            }
	            Date sent = message.getSentDate();
	            if (sent != null) {
	               System.out.println("Sent: " + sent);
	            }
	            System.out.print("Do you want to Forword [y/n] : ");
	            String ans = reader.readLine();
	            if ("Y".equals(ans) || "y".equals(ans)) {
	               Message forward = new MimeMessage(session);
	               // Fill in header
	               forward.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(from));
	               forward.setSubject("Fwd: " + message.getSubject());
	               forward.setFrom(new InternetAddress(to));

	               // Create the message part
	               MimeBodyPart messageBodyPart = new MimeBodyPart();
	               // Create a multipart message
	               Multipart multipart = new MimeMultipart();
	               // set content
	               messageBodyPart.setContent(message, "message/rfc822");
	               // Add part to multi part
	               multipart.addBodyPart(messageBodyPart);
	               // Associate multi-part with message
	               forward.setContent(multipart);
	               forward.saveChanges();

	               // Send the message by authenticating the SMTP server
	               // Create a Transport instance and call the sendMessage
	               Transport t = session.getTransport("smtp");
	               try {
	                  //connect to the smpt server using transport instance
			  //change the user and password accordingly
	                  t.connect(username, password);
	                  t.sendMessage(forward, forward.getAllRecipients());
	               } finally {
	                  t.close();
	               }

	               System.out.println("message forwarded successfully....");

	            // close the store and folder objects
	            folder.close(false);
	            store.close();
	            }// end if

	         }// end for
	   }// end if
	   } catch (Exception e) {
	      e.printStackTrace();
	   }
	}
   

   public static void DeleteEmail(String pop3Host, String storeType, String user, String password) 
	   {
	      try 
	      {
	         // get the session object
	         Properties properties = new Properties();
	         properties.put("mail.store.protocol", "pop3");
	         properties.put("mail.pop3s.host", pop3Host);
	         properties.put("mail.pop3s.port", "995");
	         properties.put("mail.pop3.starttls.enable", "true");
	         Session emailSession = Session.getDefaultInstance(properties);
	         // emailSession.setDebug(true);

	         // create the POP3 store object and connect with the pop server
	         Store store = emailSession.getStore("pop3s");

	         store.connect(pop3Host, user, password);

	         // create the folder object and open it
	         Folder emailFolder = store.getFolder("INBOX");
	         emailFolder.open(Folder.READ_WRITE);

	         BufferedReader reader = new BufferedReader(new InputStreamReader(
	            System.in));
	         // retrieve the messages from the folder in an array and print it
	         Message[] messages = emailFolder.getMessages();
	         System.out.println("messages.length---" + messages.length);
	         for (int i = 0; i < messages.length; i++) {
	            Message message = messages[i];
	            System.out.println("---------------------------------");
	            System.out.println("Email Number " + (i + 1));
	            System.out.println("Subject: " + message.getSubject());
	            System.out.println("From: " + message.getFrom()[0]);

	            String subject = message.getSubject();
	            System.out.print("Do you want to delete this message [y/n] ? ");
	            String ans = reader.readLine();
	            if ("Y".equals(ans) || "y".equals(ans)) {
		       // set the DELETE flag to true
		       message.setFlag(Flags.Flag.DELETED, true);
		       System.out.println("Marked DELETE for message: " + subject);
	            } else if ("n".equals(ans)) {
	            	System.out.println("Break operation");
		       break;
	            }
	         }
	         // expunges the folder to remove messages which are marked deleted
	         emailFolder.close(true);
	         store.close();

	      } catch (NoSuchProviderException e) {
	         e.printStackTrace();
	      } catch (MessagingException e) {
	         e.printStackTrace();
	      } catch (IOException io) {
	         io.printStackTrace();
	      }
	   }

   
   public static void SendEmailUsingGMailSMTP(String host,String username,String password,
		   String to, String from, String subject, String body, String filename ) {

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	         protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	         }
	      });

	      try {
	         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	         InternetAddress.parse(to));

	         // Set Subject: header field
	         message.setSubject(subject);

	         // Now set the actual message
	         message.setText(body);

	         // Send message
	         Transport.send(message);

	         System.out.println("Sent message successfully....");

	      } catch (MessagingException e) {
	            throw new RuntimeException(e);
	      }
	   }

   
   public static void QuotaManagement(String IMAPHost, String user, String password) {
         try 
         {
            Properties properties = new Properties();
            properties.put("mail.store.protocol", "imaps");
            properties.put("mail.imaps.port", "993");
            properties.put("mail.imaps.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);
            // emailSession.setDebug(true);

            // create the IMAP3 store object and connect with the pop server
            Store store = emailSession.getStore("imaps");

            //change the user and password accordingly
            store.connect(IMAPHost, user, password);
            IMAPStore imapStore = (IMAPStore) store;
            System.out.println("imapStore ---" + imapStore);

            //get quota
            Quota[] quotas = imapStore.getQuota("INBOX");
            //Iterate through the Quotas
            for (Quota quota : quotas) {
               System.out.println(String.format("quotaRoot:'%s'",
                  quota.quotaRoot));
               //Iterate through the Quota Resource
               for (Quota.Resource resource : quota.resources) {
                  System.out.println(String.format(
                     "name:'%s', limit:'%s', usage:'%s'", resource.name,
                     resource.limit, resource.usage));
               }
            }
         } catch (Exception e) 
         {
            e.printStackTrace();
         }
      }


}