package com.isrdc.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import com.isrdc.dtos.StudentDto;
import com.isrdc.repos.StudentRepo;
import com.isrdc.services.StudentService;

@Controller
public class StudentController {
@Autowired
	private StudentService  serv;

//....................delete.................
    @GetMapping("/delete/{id}")
  public String deleteStudent(@PathVariable("id")Integer studentId ) {
	     serv.deleteStudent(studentId);
    	return "index";
  }
	

    
  //....................Read All students.................
	@GetMapping("/show_students")
	public String showStudents(Model model) {
		ArrayList<StudentDto> dto=serv.collectStudents();
		model.addAttribute("students",dto);
		return "view_students";
	}
	
	
	//....................  show Edit form.................
	 @GetMapping("/show_editform/{id}")
	  public String editStudent(@PathVariable("id")Integer studentId ,Model model) {
		   StudentDto dto=serv.fetchStudent(studentId);
		 model.addAttribute("student",dto);
	    	return "edit_studentform";
	  }
	 
	 //...............................(sir) update...................................
//   @GetMapping("/edit/{id}") 
//   public String showEditForm(@PathVariable("id") Integer studentId ,Model model) {
//	    StudentDto sdto=serv.fetchStudent(studentId);
//	    model.addAttribute("student",sdto);
//	   return "students_form";
//   }
//    
	 
	//............................update .......................
	 @PostMapping("/update_form")
	 public String updateStudent( StudentDto sdto) {
		 serv.updateStudent(sdto);
		 return "index";
	 }
	 
	 
	//....................show student form  create................
	@GetMapping("/show_student_form")
	public String showStudentForm(Model model) {
		StudentDto stdto=new StudentDto();
		model.addAttribute("student",stdto);
		return "student_form";
	}
	
	//....................save.................
	@PostMapping("/save_student")
	public  String saveStudent(StudentDto sdto) {
		serv.save(sdto);
		
		return "index";
	}
}
