package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dep2") //http://localhost:3347/dep1/one
public class A2Controller {
  @GetMapping("/one")
  public ModelAndView reqOne() {
	  ModelAndView mav =new ModelAndView();
	  mav.addObject("msg","A2 controller => req 1.......");
	  mav.setViewName("index");
	  return mav;
  }
}
