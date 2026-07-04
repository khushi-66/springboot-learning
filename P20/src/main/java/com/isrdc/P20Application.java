package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmployeeService;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class P20Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(P20Application.class, args);
		EmployeeService s=context.getBean(EmployeeService.class);
		//s.saveEmployees();
		//s.searchEmployee();
		//s.searchEmployeesByGender();
		  // s.searchEmployeeByGenderAndCountry();
		s.searchEmployeeBySalaryOrderBY();
		//s.searchEmployeeBySalaryGreaterThan();
	//	s.searchEmployeeByAgeBetween();
		//s.searchEmployeeByEmailContains();
		//s.searchEmployeeByCountryEndsWith();
		//s.searchEmployeesByIdIn();
		
	}

}
