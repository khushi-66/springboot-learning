package com.isrdc.rests;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.isrdc.dtos.StudentDto;
import com.isrdc.services.StudentService;

public class StudentRestController {

	private StudentService serv;
	
@PostMapping("/save")
public   String saveStudent(@RequestBody StudentDto dto) {
	serv.saveStudent(dto);
	 return "saved records....";
}
}
