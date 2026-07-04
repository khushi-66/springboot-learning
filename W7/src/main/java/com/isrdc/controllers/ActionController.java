package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@ResponseBody

public class ActionController {
	@GetMapping("/index")
public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/act1")
	public String infoPage( @RequestParam("nm")String name,org.springframework.ui.Model model) {

			 model.addAttribute("msg","namaste ! "+name);
			return "info";
		}
	
	
	@GetMapping("/act2")
	public String formPage( @RequestParam("nm")String name,@RequestParam("age") Integer age,org.springframework.ui.Model model) {

			 
			return "my name is "+  name +" and age is "+age;
		}
}
