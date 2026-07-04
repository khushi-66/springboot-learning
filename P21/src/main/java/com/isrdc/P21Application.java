package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class P21Application {

	public static void main(String[] args) {
		EmployeeService e=SpringApplication.run(P21Application.class, args).getBean(EmployeeService.class);
//	   e.collectEmployees();
//	   e.collectEmployeeById();
//	   e.collectEmployeeByparameterId();
//	   e.deleteEmployeeByparameterId();
		//e.collectEmployeesHQL();
	 //  e.collectHQLEmployeeByparameterId();
	  // e.deleteHQLEmployeeByparameterId();
//	e.showFewEmployeColumn();
		//e.updateEmployee();
		//e.saveEmployee();
		e.updatexEmployee();
	}  

}
