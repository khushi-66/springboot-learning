package com.isrdc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isrdc.dtos.Studentdto;

@Controller
public class ActionController {
@GetMapping("/show_students")
public ModelAndView show() {
	ArrayList <Studentdto>records=new ArrayList<>();
	records.add(new Studentdto("khushi",85.0f,34,"global"));
	records.add(new Studentdto("madhu",48.0f,23,"GyanGanga"));
	records.add(new Studentdto("riya",56.0f,16,"SRIT"));
	records.add(new Studentdto("samyak",67.0f,24,"SRGI"));
	records.add(new Studentdto("rishabh",87.0f,19,"Hitkarni"));
	records.add(new Studentdto("Aarbi",39.0f,20,"takshila"));
	ModelAndView mav=new ModelAndView();
	mav.addObject("students",records);
	mav.setViewName("students");
	return mav;
}
}
