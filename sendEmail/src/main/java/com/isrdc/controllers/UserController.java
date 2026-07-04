package com.isrdc.controllers;

import java.nio.file.attribute.UserPrincipalLookupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.isrdc.dtos.UserDto;

import com.isrdc.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService serv;
@GetMapping("/")
public String showIndexPage(Model model) {
	UserDto dto=new UserDto();
	model.addAttribute("user",dto);
    return "index";
}


@PostMapping("/save_user")
public String saveUser( UserDto dto  ,Model model) {
	UserDto udto=new UserDto();
	model.addAttribute("user",udto);
	String from="khushi.cs231113@global.org.in";
    String subject="Email Regarding opening your account";
	String msg="Congratualations Your Account is created !!";
	serv.sendEmail(from,dto.getEmail(), subject, msg);
	
	if(serv.sendEmail(from, dto.getEmail(), subject, msg)) {
		 System.out.println("Email was sent....................");
		 
	}else {
		System.out.println("Email was not sent................");
	}
	return "index";
}
}
