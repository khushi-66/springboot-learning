package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ActionController {
@GetMapping("/next1")
public String nextOne(   String email,HttpServletRequest request,HttpServletResponse   response) {
	HttpSession session=request.getSession();
	session.setAttribute("record",  email);
	return "next1";
}

@GetMapping("/next2")
public String nextTwo(HttpServletRequest request) {
	HttpSession session=request.getSession();
	String email=(String)session.getAttribute("record");
	System.out.println( "session Attribute : " +email+"sessionID : "+  session.getId());
	return "next2";
}

@GetMapping("/logout")
public String logOut(HttpSession  session) {
	session.invalidate();
	return "index";
}

@GetMapping("/home")
public String home() {
	return "index";
}
}
