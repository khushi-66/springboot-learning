package com.isrdc.services;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailsender;
public boolean sendEmail(String email,String subject,String msg) {
	boolean flag=false;
	
	MimeMessage mm=mailsender.createMimeMessage();
	MimeMessageHelper helper=new MimeMessageHelper(mm);
	
	
	//################  MimeMessage #################
	try {
		helper.setTo(email);
		helper.setSubject(subject);
		
		helper.setText(msg,true);
		mailsender.send(mm);
	}catch(MessagingException e) {
		e.printStackTrace();
	}
	
	//###################  SimpleMessage  ###################
//	  SimpleMailMessage msg=new SimpleMailMessage();
//	    msg.setFrom("khushi.cs231113@global.org.in");
//	    msg.setSubject("Test Email");
//	    msg.setTo(email);
//	    msg.setText("Hello  "+name  +"!!");
//	    mailsender.send(msg);
	return flag;
}
}
