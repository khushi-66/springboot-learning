package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.isrdc.dtos.UserDto;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@GetMapping("/send_form")
	public String sendForm(Model model) {
		UserDto  dto=new UserDto();
		 model.addAttribute("user", dto);
		return "form";
	}
	
	@PostMapping("/save_form")
	public String saveForm(@Valid @ModelAttribute("user") UserDto dto,BindingResult result) {
		String nextPage="index";
		//model.addAttribute("user",dto);
		if(result.hasErrors()) {
			nextPage="form";
		}
		System.out.println(dto);
		return nextPage;
	}
}
