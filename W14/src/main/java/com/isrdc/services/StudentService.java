package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.StudentDto;
import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo srepo; 
    
    
    //....................... way-1 ...............................
//    public void updateStudent(StudentDto stdto) {
//    	Student s=(srepo.findById(stdto.getStudentId())).get();
//    	BeanUtils.copyProperties(stdto, s);
//    	 srepo.save(s);
//    }
    
    
    //......................... way-2 ..........................
    public void updateStudent(StudentDto stdto) {
    	Student s=new Student();
    	BeanUtils.copyProperties(stdto, s);
    	srepo.updateStudent(s.getStudentId(),s.getName(),s.getCollege(),s.getMarks(),s.getDegree(),s.getFees());
         }
    
    
    public StudentDto fetchStudent(Integer id) {
    	Optional<Student> s=srepo.findById(id);
    	StudentDto dto=new StudentDto();
    	 Student st=new Student();
    	
    	if(s.isPresent()) {
    		   st=s.get();
    	  }
    	 BeanUtils.copyProperties(st, dto);
    	return dto;
    }
    
    public   void deleteStudent(Integer id) {
    	srepo.deleteById(id);
    }
    
    public void save(StudentDto sdto) {
    	Student st=new Student();
    	BeanUtils.copyProperties(sdto, st);
    	srepo.save(st);
    }
    
    public ArrayList<StudentDto> collectStudents(){
    	ArrayList<StudentDto>records=new ArrayList<>();
    	  List<Student> students= srepo.findAll();
    	    for(Student st: students) {
    	    	StudentDto stdto=new StudentDto();
    	    	BeanUtils.copyProperties(st, stdto);
    	    	 records.add(stdto);
    	    }
    	return records;
    }
}
