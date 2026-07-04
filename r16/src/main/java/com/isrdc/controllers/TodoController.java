package com.isrdc.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.isrdc.dtos.TodoDto;

@Controller
public class TodoController {
	@GetMapping("/all_todos")
public String showAlllTodos(Model model) {
	RestTemplate rt=new RestTemplate();
	String url="https://jsonplaceholder.typicode.com/todos/";
	ResponseEntity<TodoDto[]>re=rt.getForEntity(url, TodoDto[].class);
	int statuscode=re.getStatusCode().value();
	if(statuscode==200) {
		TodoDto[] arr=re.getBody();
		for(TodoDto next:arr) {
			System.out.println(next);
		}
		model.addAttribute("records", arr);
		
	}
	return "all_todos";
}
}
