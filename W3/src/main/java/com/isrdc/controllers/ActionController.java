package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActionController {
   @GetMapping("/one")
   public ModelAndView reqOne() {
	   ModelAndView mav=new ModelAndView();
	   mav.addObject("msg","A1 controller => req one");
	   mav.setViewName("index");
	   return mav;
	   
   }
   
   
}
