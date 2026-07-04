package com.isrdc.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
  private EmployeeRepo emrepo;
  
  
  //constructor injection......
  @Autowired
  public EmployeeService (EmployeeRepo e) {
	  this.emrepo=e;
  }
  
  public void searchEmployeeByEmailContains() {
	  List<Employee>em=  emrepo.findByEmailContains("ani");
	  for(Employee e:em) {
	    	 System.out.println(e.getName()+"--"+e.getEmail());
	     }
  }
  
  public void searchEmployeeByCountryEndsWith() {
	  List<Employee>em=  emrepo.findByCountryEndingWith("an");
	  for(Employee e:em) {
	    	 System.out.println(e.getName()+"--"+e.getEmail());
	     }
  }
  
      public void searchEmployeeByAgeBetween() {
    	  List<Employee>em=  emrepo.findByAgeBetween(10, 15);
    	  for(Employee e:em) {
 	    	 System.out.println(e.getName()+"--"+e.getEmail());
 	     }
      }
      
  public void searchEmployeeBySalaryGreaterThan() {
	  List<Employee>em= emrepo.findBySalaryGreaterThan(34000);
	     for(Employee e:em) {
	    	 System.out.println(e.getName()+"--"+e.getEmail());
	     }
  }
     
  public void searchEmployeeBySalaryOrderBY() {
		 List<Employee>emp= emrepo.findBySalaryOrderBy();
		    for(Employee next:emp) {
		       System.out.println(next.getName()+"--"+next.getAge()+"--"+next.getCountry());
		   }
	  }
  
  public void searchEmployeeByGenderAndCountry() {
	 List<Employee>emp= emrepo.findByGenderAndCountry('F', "uk");
	    for(Employee next:emp) {
	       System.out.println(next.getName()+"--"+next.getAge()+"--"+next.getCountry());
	   }
  }
  
  public void searchEmployeesByIdIn() {
	  List<Employee>ems=emrepo.findByEmployeeIdIn(Arrays.asList(2,4,5));
	  System.out.println(ems);
	   for(Employee next: ems) {
		   System.out.println(next.getName());
	   }
  }
  
  public void searchEmployeesByGender() {
	  List<Employee>ems=emrepo.findByGender('F');
	   for(Employee next: ems) {
		   System.out.println(next.getName());
	   }
  }
  
 public void searchEmployee(){
	  Employee em= emrepo.findByEmail("nobita@gmail.com");
	     System.out.println(em.getName()+" - "+em.getPassword());
 }
 
  public void saveEmployees() {
	  Employee e1=new Employee("nobita", 10, 9, 34580, 'M',"487597","nobita@gmail.com","japan");
	  Employee e2=new Employee("shizuka", 11, 2, 34000, 'F',"47868","shizuka@gmail.com","japan");
	  Employee e3=new Employee("shinchain", 12, 3, 33749, 'M',"4877gh","shinchain@gmail.com","korian");
	  Employee e4=new Employee("suniyo", 13,45, 348579, 'M',"4ry99y9","suniyo@gmail.com","china");
	  Employee e5=new Employee("doremon", 14, 12, 34584, 'M',"4848989","doremon@gmail.com","turki");
	  Employee e6=new Employee("yumiko", 15, 67, 34340, 'F',"4824857","yumiko@gmail.com","uk");
       emrepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
  
  
  }
  
  
  
  
  
  
}
