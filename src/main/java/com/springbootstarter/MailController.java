package com.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping("/signup")
	public String signup() {
		return "Please sign up for our service";
	}
	@RequestMapping("/signupSuccess")
	public String signUpSucess() {
		User user=new User();
		user.setFirstName("krishna");
		user.setLastName("sandeep");
		user.setEmailAddress("vanamasandeep2019@gmail.com");
		try {
			notificationService.sendNotification(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Thanks for signing up";
	}


}
