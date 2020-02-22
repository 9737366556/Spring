package com.joker.demo.userUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


/**
 * Purpose : For sending mail 
 *  
 * @author Nikunj Balar
 *
 */
@Component
public class Jms {

	@Autowired
	private JavaMailSender mailSender;

	// function for sending mail
	public void sendMail(String email ,String token) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("kunj.hasi103@gmail.com");
		message.setTo(email);
		message.setText("your registration for kunj app is successfull. \n your token id is "+token);

		mailSender.send(message);
	}
}
