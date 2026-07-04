package com.isrdc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
  private EmployeeRepo employeerepo;
  
  public EmployeeService(EmployeeRepo employeerepo) {
	  this.employeerepo=employeerepo;
  }
  public void saveEmployee() {
	  Employee  e=new Employee("khushi","kh@gmail.com","2837xjv");

	  Employee  e1=new Employee("pragya","pragya@gmail.com","283237");
	  Employee  e2=new Employee("ratnesh","ratan@gmail.com","2sdf237");
	  Employee  e3=new Employee("ayushi","ayushi@gmail.com","2s34637");
	  
	  employeerepo.saveAll(Arrays.asList(e,e1,e2,e3));
  }
  
  
  public void findEmployeeId() {
	Optional<Employee> opt= employeerepo.findById(3);
	if(opt.isPresent()) {
		Employee emp=opt.get();
		System.out.println(emp.getEmail()+"-- "+emp.getName()+"  --"+emp.getPassword());
		}else {
			System.out.println("No matching record found for the given ID ");
		}
  }
  
  
  public void findAllEmpoyeesById() {
	  Iterable<Employee> ems=employeerepo.findAllById(Arrays.asList(2,4));
	    for(Employee emp:ems) {
	    	System.out.println(emp.getEmail()+"-- "+emp.getName()+"  --"+emp.getPassword());
	    }
  }
  
  public void findAllEmployees() {
	  Iterable<Employee> em=employeerepo.findAll();
	  for(Employee emp:em) {
	    	System.out.println(emp.getEmail()+"-- "+emp.getName()+"  --"+emp.getPassword());
	    }    
	  
  }
  
  public void countEmployee() {
	  System.out.println(employeerepo.count());
  }
  
  public void checkEmployeeExist() {
	  boolean flag=employeerepo.existsById(3);
	  System.out.println(" Is Record exist 3 ?  "+flag);
	  
	  System.out.println(" Is Record exist 12 ?  "+employeerepo.existsById(12));
	  
  }
  
  
  public void deleteByemployeeId() {
	  
	  employeerepo.deleteById(5);
	  
	  
  }
  
  public void deleteEmployee() {
	   Employee em=new Employee();
	   em.setEmail("ayushi@gmail.com");
	   em.setEmployeeId(4);    //------sufficient to delete
	  em.setName("ayushi");
	 em.setPassword("2s34637");
	   employeerepo.delete(em);
	   
  }
  
  
  public void deleteAllEmployees() {
	  employeerepo.deleteAllById(Arrays.asList(2,4));
  }
  
  public void deleteAllEmployeesBYId() {
	  Employee  e=new Employee(  1,"khushi","kh@gmail.com","2837xjv");
	  Employee  e1=new Employee(2,"pragya","pragya@gmail.com","283237");
	  Employee  e2=new Employee(3,"ratnesh","ratan@gmail.com","2sdf237");
	  Employee  e3=new Employee(4,"ayushi","ayushi@gmail.com","2s34637");
	    employeerepo.deleteAll(Arrays.asList(e1,e3));
  }
  
  public void deleteAllemployees() {
	  employeerepo.deleteAll();
  }
}
