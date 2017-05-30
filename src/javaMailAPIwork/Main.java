package javaMailAPIwork;

public class Main {

	public static void main(String[] args) {
		// change accordingly
		//  String host = "pop.gmail.com";
		//String port = "995";
		 String host = "pop.rediffmail.com";
		 String port = "110";
	      String mailStoreType = "pop3";
	     // String username = "pritamkhose";
	     // String password = "pritam@4";
	      String username = "p.khose";
	      String password = "priya24365";
	      
	      String to="pritamkhose@gmail.com";  
	      String from="pritamkhose@gmail.com";  
	      String subject = "Hello Javamail API";
	      String msg  = "Hello, \nRegards,\n\tPritam";
	    
	 //    SendMailSSL2.SendMail(username,password,to,from,subject,msg);
	      
	      CheckingMails.check(host,port, mailStoreType, username, password);

	}

}
