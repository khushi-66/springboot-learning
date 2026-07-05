package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.services.StudentService;

@RestController
public class consumerRestController {
	@Autowired
	private StudentService serv;
	
    @GetMapping("/read")
	public ResponseEntity<String>fetchMessage(){
    	   String message=serv.getMsg();
    	   
		return new ResponseEntity(message,HttpStatus.OK);
	}
	

}
