package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.models.Employee;
import com.isrdc.services.EmployeeService;

@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService serv;
	@GetMapping("/subscribe")
	public ResponseEntity<String>subscriber( ) {
		
		String msg=serv.getMessage();
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
