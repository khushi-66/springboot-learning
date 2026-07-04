package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class R15Application {

	public static void main(String[] args) {
		SpringApplication.run(R15Application.class, args);
		showAllRecords();
	}

	public static void showAllRecords() {
		RestTemplate rt=new RestTemplate();
		String url="https://jsonplaceholder.typicode.com/todos/";
	ResponseEntity<ToDoDto[]>re=	rt.getForEntity(url, ToDoDto[].class);
	int statuscode=re.getStatusCode().value();
	  if(statuscode==200) {
		  ToDoDto[] arr=re.getBody();
		  for(ToDoDto next:arr) {
			  System.out.println("-"+next);
		  }
	  }
	}
}
