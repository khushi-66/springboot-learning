package com.isrdc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.isrdc.dtos.StudentDto;

@Controller
public class ActionController {
	@GetMapping("/act")
public String showRecords(Model model) {
	ArrayList<StudentDto>users=new ArrayList<>();
	users.add(new StudentDto("raju",25,'M',"SRIT"));
	users.add(new StudentDto("chutki",23,'F',"Global"));
	users.add(new StudentDto("bheem",18,'M',"GGCT"));
	users.add(new StudentDto("jaggu",19,'O',"SRGI"));
	users.add(new StudentDto("hathodi",20,'M',"JEC"));
	model.addAttribute("users",users);
	
	return "users";
	
	
}
}
