package com.isrdc.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Student;

import jakarta.transaction.Transactional;



public interface studentRepo  extends CrudRepository<Student, Integer>{
	

   }
