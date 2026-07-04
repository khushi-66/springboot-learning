package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController2 {
@GetMapping("/two")

public String reqTwo(Model model) {
	
	model.addAttribute("msg", "Action controller 2  => req two.......");
	return "index";
}
}
