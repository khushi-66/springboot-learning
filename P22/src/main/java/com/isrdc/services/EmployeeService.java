package com.isrdc.services;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	private  static  final int pagesize=3;
	private   EmployeeRepo emrepo;
	
	@Autowired
	public void setEmployeeRepo(EmployeeRepo emrepo)
	   {
		    this.emrepo=emrepo;
		    }
	
	public void collectAllEmployees()
	{
		
		  List<Employee>emp=emrepo.findAll();
		  
		  for(Employee em:emp) {
			  System.out.println(emp);
		  }
	}
	
	public void showEmployeeQueryByExample()
	{
		 Employee emp=new Employee();
		// emp.setGender('M');
		 emp.setCountry("india");
		 Example<Employee>exmp=Example.of(emp);
		 List<Employee>em=emrepo.findAll(exmp);
		 for(Employee e:em) {
			  System.out.println(e);
		  }
	}
	
	public void showEmployeesByOrder() {
		//Sort sort=Sort.by("age");
		//Sort sort=Sort.by("age").ascending();
		Sort sort=Sort.by("salary").descending();
	List<Employee>list=emrepo.findAll(sort);
		    for(Employee em:list) {
			  System.out.println(em);
		  }
	}
	
	public void collectEmployeesBypages(int pageno)
	{
		  PageRequest pagereq=PageRequest.of( pageno-1,pagesize);
		  org.springframework.data.domain.Page<Employee>page=emrepo.findAll(pagereq);
		   List<Employee>list=page.getContent();
		  for(Employee em:list) {
			  System.out.println(list);
		  }
	}
	
}
