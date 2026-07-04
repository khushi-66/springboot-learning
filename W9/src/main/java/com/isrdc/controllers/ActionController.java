package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isrdc.dtos.UserDto;

@Controller
public class ActionController {
   @GetMapping("/showform")
   public String showForm(Model model) {
	   UserDto userdto=new UserDto();
	   model.addAttribute("user",userdto);
	   return "form";
   }
   
   @PostMapping("/save")
   @ResponseBody
    public String  handleForm(UserDto userdto) {
	   
	   return userdto.toString();
   }
   
   
}
