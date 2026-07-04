package com.isrdc.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.StudentDto;
import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public void saveStudent(StudentDto dto) {
		 Student s=new Student();
		 BeanUtils.copyProperties(dto, s);
		 repo.save(s);
	}
	

}
