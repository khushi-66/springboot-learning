package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//http://localhost:9090/study/2/11 hint:  volume:2 chapter:11
@Controller
public class AController {
@GetMapping("/pro/{group}")
public String  process( @PathVariable("group")String group,Model model) {
	model.addAttribute("msg","Hello  !"+ group);
	return "info";
}


@GetMapping("/study/{volume}/{chapter}")
public   String info( @PathVariable("chapter")Integer chapt,@PathVariable("volume")Integer vol ,Model model) {
	model.addAttribute("studyInfo","volume:  "+ vol +"  and  chapter: "+chapt );
	return "studyinfo";
}
}
