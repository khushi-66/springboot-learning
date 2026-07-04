package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.services.EmailService;



@Controller
public class ActionController {
@Autowired
 private EmailService  serv;
	
@GetMapping("/send")
public String sendEmail(String name,String email) {
	String htmlMail="<h1>Welcome "+name+ "!!</h1>";
	serv.sendEmail(email, "Test 3 Email", htmlMail);
	return "index";
}
}
