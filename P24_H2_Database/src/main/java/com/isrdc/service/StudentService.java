package com.isrdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
@Autowired
private StudentRepo repo;

public void saveStudent() {
	Student s=new Student("vikas saxena",21,89.67f);
	repo.save(s);
}
}
