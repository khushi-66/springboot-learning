package com.isrdc.utils;

import org.jspecify.annotations.Nullable;
import org.springframework.batch.infrastructure.item.ItemProcessor;

import com.isrdc.entites.Employees;

public class EmployeeProcessor implements ItemProcessor<Employees, Employees> {

	@Override
	public @Nullable Employees process(Employees item) throws Exception {
		
		Employees emp=new Employees();
		emp.setEmpId(item.getEmpId());
		emp.setName(item.getName().toUpperCase());
		emp.setPassword(item.getPassword());
		emp.setPhone(item.getPhone());
		emp.setCity(item.getCity().toUpperCase());
		emp.setSalary(item.getSalary());
		emp.setEmail(item.getEmail());
		return emp;
	}

}
