package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Actioncontroller {
	@GetMapping("/one")
public ModelAndView reqOne() {
	ModelAndView mav=new ModelAndView();
	mav.addObject("msg","timeup.......");
	mav.setViewName("index");
	
	return mav;
}
	@GetMapping("/two")
	public ModelAndView reqTwo(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Time start...!");
		mav.setViewName("info");
		return mav;
	}
}
