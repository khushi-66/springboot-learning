package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.isrdc.dtos.UserDto;

import jakarta.validation.Valid;

@Controller
public class UserController {
 @GetMapping("/show_form")
	public ModelAndView showForm() {
	 ModelAndView mav=new ModelAndView();
	 UserDto udto=new UserDto();
	 mav.addObject("user",udto);
	 mav.setViewName("form");
	  return mav;
  }
 
 @PostMapping("/save")
	public String saveForm(   @Valid   @ModelAttribute("user")  UserDto udto ,BindingResult result,Model model) {
	System.out.println(udto);
	String nextPage ="index";
	if(result.hasErrors()) {
	//	model.addAttribute("user",udto);
		nextPage="form";
	 }
	  return nextPage;
}
 
}
