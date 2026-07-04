package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActionController {
	//http://localhost:9090/act1?nm=kinjal
	@GetMapping("/act")
public ModelAndView actOne(@RequestParam("nm") String name) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("myname","Hello !"+name);
		mav.setViewName("index");
		return mav;
	}
}
