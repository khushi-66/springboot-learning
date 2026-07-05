package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.models.Student;
import com.isrdc.services.StudentService;

@ RestController
public class StudentRestController {
	@Autowired
	private StudentService serv;
	
@PostMapping("/send-msg")
	public ResponseEntity<String> sendMessage(@RequestBody Student s){
	String res=serv.postMessage(s);
		return new  ResponseEntity<>(res,HttpStatus.OK) ;
	}

}
