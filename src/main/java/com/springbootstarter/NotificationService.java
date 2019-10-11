package com.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	private JavaMailSender mailSender;
	
	@Autowired
	public NotificationService(JavaMailSender mailSender) {
		this.mailSender=mailSender;
	}

	public void sendNotification(User user) {
		//send mail
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setFrom("vanamasandeep2016@gmail.com");
		mail.setSubject("Sign up Confirmation");
		mail.setText("Hi Srujana");
		mailSender.send(mail);
		
		
	}
	
}
