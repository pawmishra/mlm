package com.javerian.erp.mlm.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SendMail {

	@Autowired
	private Environment environment;

	public void sendMail(String subject, String textMessage, String toEmailAddress, String fromEmailAddress) {

		final String username = environment.getRequiredProperty("mail.username");
		final String password = environment.getRequiredProperty("mail.password");

		// Properties props = new Properties();
		// props.put("mail.smtp.auth", "true");
		// props.put("mail.smtp.starttls.enable", "true");
		// props.put("mail.smtp.host", "smtp.gmail.com");
		// props.put("mail.smtp.port", "587");

		Properties properties = new Properties();

		properties.put("mail.smtp.auth", environment.getRequiredProperty("mail.smtp.auth"));
		properties.put("mail.smtp.starttls.enable", environment.getRequiredProperty("mail.smtp.starttls.enable"));
		properties.put("mail.smtp.host", environment.getRequiredProperty("mail.smtp.host"));
		properties.put("mail.smtp.port", environment.getRequiredProperty("mail.smtp.port"));

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			// message.setFrom(new InternetAddress("from-email@gmail.com"));
			// message.setRecipients(Message.RecipientType.TO,
			// InternetAddress.parse("to-email@gmail.com"));
			// message.setSubject("Testing Subject");
			// message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");

			message.setFrom(new InternetAddress(fromEmailAddress));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailAddress));
			message.setSubject(subject);
			message.setText(textMessage);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
