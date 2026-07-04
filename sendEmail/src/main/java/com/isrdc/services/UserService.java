package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
  private JavaMailSender mailsender;
	
	public boolean sendEmail(String from,String email,String subject,String msg) {
		boolean flag=false;
		try {
			SimpleMailMessage message=new SimpleMailMessage();
			message.setTo(email);
			message.setSubject(subject);
			message.setFrom(from);
			message.setText(msg);
			mailsender.send(message);
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return flag;
	}
}
