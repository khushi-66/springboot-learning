package com.isrdc.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.EmployeeDto;
import com.isrdc.entities.Employee;
import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
private EmployeeRepo emrepo;
public void saveEmployee(EmployeeDto e) {
	Employee em=new Employee();
	BeanUtils.copyProperties(e, em);
	emrepo.save(em);
}
}
