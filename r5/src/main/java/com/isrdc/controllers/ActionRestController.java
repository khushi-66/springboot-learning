package com.isrdc.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.isrdc.dtos.Userdto;

@RestController
public class ActionRestController {
 @GetMapping("/pro")
	public String process() {
	  Userdto u=new Userdto();
	  Gson gson=new Gson();
	  u.setName("khushi sahu");
	  u.setAge(21);
	  u.setMarks(79.45f);
	  u.setCollege("Global");
	  return gson.toJson(u);
  }
}
