package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.dtos.Userdto;

@Controller
public class AController {
	@GetMapping("/showinfo")
   public String showInfo(Model model) {
	   Userdto userdto=new Userdto();
	   userdto.setAge(23);
	   userdto.setMarks(34);
	   userdto.setName("khushi");
	   model.addAttribute("user",userdto);
	   
	    return "info";
   }
}
