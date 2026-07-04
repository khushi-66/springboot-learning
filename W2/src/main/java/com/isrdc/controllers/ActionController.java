package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ActionController {
    @GetMapping("/one")
	public String reqOne(org.springframework.ui.Model model) {
    	 model.addAttribute("msg", "jay ho....");
    	
		return "index";
	}
}
