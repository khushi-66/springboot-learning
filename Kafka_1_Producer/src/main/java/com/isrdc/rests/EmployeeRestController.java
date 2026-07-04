package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.models.Employee;
import com.isrdc.services.EmployeeService;

@RestController
public class EmployeeRestController {
    @Autowired
    private EmployeeService serv;
	@PostMapping("/publish")
	public ResponseEntity<String>publish( @RequestBody Employee em) {
		String msg=serv.postMessage(em);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
