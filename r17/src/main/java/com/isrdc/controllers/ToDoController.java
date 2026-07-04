package com.isrdc.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.TodoDto;
import com.isrdc.services.TodoService;

@RestController
public class ToDoController {
	@Autowired
	private TodoService serv;
	
@GetMapping(value="/show",produces="application/json")
public ResponseEntity<TodoDto[]> showTodos() {
	TodoDto[] arr=serv.fetchTodos();
	HttpHeaders hd=new HttpHeaders();
	hd.set("Access-control-Allow-origin","*");
	
	return new ResponseEntity<>(arr, hd,HttpStatus.OK );
}
}
