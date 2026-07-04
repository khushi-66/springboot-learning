package com.isrdc.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo emrepo;
	

	
	public void saveEmployee() {
		Employee em=new Employee("yumiko" ,"india",45,3,45556,'F',"4555","y@gmail.com");
		
		emrepo.save(em);
	}
	
	
	
	public void collectEmployees() {
		List<Employee>ems=emrepo.collectAllEmployees();
		
		for(Employee em:ems){
			System.out.println(em.getName());
		}
	}
	
	
	public void collectEmployeeById() {
		Employee emp=emrepo.collectEmployeeById();
		System.out.println(emp.getName());
	}
	
	public void deleteEmployeeByparameterId() {
		emrepo.deleteEmployeeById(4);
		System.out.println("deleted id ");
	}
	
	public void collectEmployeeByparameterId() {
		Employee emp=emrepo.collectEmployeeById(4);
		System.out.println(emp.getName());
	}
	
	public void collectHQLEmployeeByparameterId() {
		Employee emp=emrepo.collectHQLEmployeeById(3);
		System.out.println(emp.getName()+"  HQL");
	}
	public void collectEmployeesHQL() {
		List<Employee>ems=emrepo.collectAllHQLEmployees();
		
		for(Employee em:ems){
			System.out.println(em.getName()+"   ----HQL Employee");
		}
	}
	
	public void deleteHQLEmployeeByparameterId() {
		emrepo.deleteHQLEmployeeById(3);
		System.out.println("deleted id ");
	}
	
	public void showFewEmployeColumn() {
		List<Object[]> list=emrepo.collectFewEmployeeColumn();
		
		for(Object[] em:list){
			System.out.println(em[0]+" -"+ em[1]);
		}
	}
	public void updatexEmployee() {
Employee em=new Employee("yumiko" ,"india",45,3,45556,'F',"4555","y@gmail.com");
		em.setEmployeeId(1);
		emrepo.save(em);
	}
	
	public void updateEmployee() {
		emrepo.updateEmployee(1, "shinchain");
	}
}
