package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repo.studentRepo;

@Service
public class StudentService {
	@Autowired
	private studentRepo studentrepo;
     
	public void saveStudent() {
		 Student student =new Student();
		  student.setEmail("kksahu8277@gmail.com");
		  student.setName("gopal maharaj");
		  student.setPassword("357909");
		 // student.setStudentId(2);
		  studentrepo.save(student);
	}
	
	
	public void saveAllStudents() {
		  Student s1=new Student("jay","jay@gmail.com","34423");
		  Student s2=new Student("samyak","samyak@gmail.com","387683");
		  Student s3=new Student("vibhuti","vibhu@gmail.com","38479");
		  
		  List<Student>students=new ArrayList<Student>();
		  students.add(s1);
		  students.add(s2);
		  students.add(s3);
		  studentrepo.saveAll(students);
		  
		
	}
}
