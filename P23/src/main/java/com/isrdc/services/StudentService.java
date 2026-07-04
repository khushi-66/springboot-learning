package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
  
  private  StudentRepo  repo;
  
         @Autowired
        public  void setStudentRepo( StudentRepo srepo) {
	  this.repo=srepo;
  }
  
	public void saveStudent() {
		Student s=new Student("yumiko" ,18);
		repo.save(s);
	}
	
}
