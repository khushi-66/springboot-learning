package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class P19Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(P19Application.class, args);
	 EmployeeService em= context.getBean(EmployeeService.class);
	    // em.saveEmployee();
		//context.getBean(EmployeeService.class).findEmployeeId();
		//context.getBean(EmployeeService.class).findAllEmpoyeesById();
		//context.getBean(EmployeeService.class).findAllEmployees();
		//context.getBean(EmployeeService.class).checkEmployeeExist();
   //context.getBean(EmployeeService.class).countEmployee();;
		//context.getBean(EmployeeService.class).deleteByemployeeId();
	//context.getBean(EmployeeService.class).deleteEmployee();
	//	context.getBean(EmployeeService.class).deleteAllEmployees();;
	//context.getBean(EmployeeService.class).deleteAllEmployeesBYId();;
	//  em.deleteAllemployees();	
		
		
		
		
		
	}

}
