package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmployeeService;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class P22Application {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context=SpringApplication.run(P22Application.class, args);
           EmployeeService s=  context.getBean(EmployeeService.class);
          // s.collectAllEmployees();
          // s.collectEmployeesBypages(1);
          // s.collectEmployeesBypages(2);
          // s.showEmployeesByOrder();
           s.showEmployeeQueryByExample();
             
	}

}
