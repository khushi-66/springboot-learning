package com.isrdc.rests;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.isrdc.dtos.Employeedto;

@RestController
public class ActionRestController {
	@GetMapping(value="/show",produces = "application/json")
public ResponseEntity<String> showRecord() {
	Employeedto em=new Employeedto("Gopal verma",23,"software engeneer",65000.f);
	String resp=new Gson().toJson(em);
	return new ResponseEntity<String>(resp, HttpStatus.CREATED);
}
		
}
