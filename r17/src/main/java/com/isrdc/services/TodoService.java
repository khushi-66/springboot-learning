package com.isrdc.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isrdc.dtos.TodoDto;

@Service
public class TodoService {

	public TodoDto[] fetchTodos() {
		RestTemplate rt=new RestTemplate();
		String url="https://jsonplaceholder.typicode.com/todos/";
		  ResponseEntity<TodoDto[]> re=rt.getForEntity(url,TodoDto[].class);
		   int statuscode=  re.getStatusCode().value();
		   TodoDto[] arr=null;
		   if(statuscode==200) {
			   arr=re.getBody();
		   }
		   return arr;
	}
}
