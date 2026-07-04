package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class R14Application {

	public static void main(String[] args) {
		SpringApplication.run(R14Application.class, args);
		String url="https://jsonplaceholder.typicode.com/todos/150";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<ToDoDto>re=rt.getForEntity( url, ToDoDto.class);
		int statuscode=re.getStatusCode().value();
		if(statuscode==200) {
			ToDoDto todo=re.getBody();
			System.out.println(todo);
		}
	}

}
