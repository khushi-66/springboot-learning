package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.isrdc.dtos.EmployeeDto;
import com.isrdc.services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService emserv;
	
	@PostMapping("/save_employee")
	public String saveEmployeeForm(EmployeeDto emdto  ) {
			emserv.saveEmployee(emdto);
		return "index";
		
	}
	
	@GetMapping("/show_employee_form")
public String showEmployeeForm(Model model) {
		EmployeeDto em=new EmployeeDto();
		model.addAttribute("employee", em);
	return "employee_form";
	
}
}
