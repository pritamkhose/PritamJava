package javaMailAPI;

import static javax.mail.Message.RecipientType.TO;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class fdh {

  public static void main(String[] args) throws AddressException, MessagingException, IOException {

      Properties props = new Properties();

     
      props.setProperty("mail.smtp.host", "smtp.example.com");
      props.setProperty("mail.smtp.port", "587");
      props.setProperty("mail.smtp.auth", "true");

     
      props.setProperty("mail.smtp.connectiontimeout", "5000");
      props.setProperty("mail.smtp.timeout", "5000");

     
      props.setProperty("mail.user", "majiky");
      props.setProperty("mail.host", "smtp.example.com");

     
      props.setProperty("mail.debug", "true");

     
      class PasswordAuthenticatior extends Authenticator{
            private String username;
            private String password;

            PasswordAuthenticatior(String username, String password) {
              this.username = username;
              this.password = password;
            }

            @Override
            public PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
          }
      }

     
      Session session = Session.getDefaultInstance(
                      props,
                      new PasswordAuthenticatior("majiky","**passwd**")
      );

      MimeMessage msg = new MimeMessage(session);

      msg.setFrom(new InternetAddress("majiky@example.com"));
      msg.setSender(new InternetAddress("majiky@example.com"));
     
      msg.setRecipient(TO, new InternetAddress("to@destination.com"));

      msg.setSubject("hi", "utf-8");
      msg.setText("hello");

     
      msg.writeTo(System.out);

      Transport.send(msg);

  }

}