package emaol;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class SendMailSSL {
	public static void main(String[] args) {

		final String username = "XXX@gmail.com";
		final String password = "XXXX";

		Properties props = new Properties();
		props.put("mail.smtps.auth", "true");
		props.put("mail.smtps.starttls.enable", "true");
		props.put("mail.smtps.host", "smtp.gmail.com");
		props.put("mail.smtps.port", "465");
		 props.put("mail.smtps.starttls.enable","true");
		    props.put("mail.smtps.debug", "true");
		    props.put("mail.smtps.auth", "true");
		props.put("mail.smtps.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.ssl.enable", "true");
		
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("XXXX@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("XXXX@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
