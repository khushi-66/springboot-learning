package com.isrdc.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepo  extends CrudRepository<Employee, Integer> {
	
	//   SQL ...........................................................
     @ Query(value="select * from employees",nativeQuery=true)
	public List<Employee>collectAllEmployees();
     
     @Query(value="select * from employees where employee_id=3", nativeQuery=true)
    public  Employee  collectEmployeeById();
     
     @Transactional()
     @Modifying
     @Query(value=" delete from employees where employee_id=:empId", nativeQuery=true)
     public  void  deleteEmployeeById(Integer empId);
     
     
     
     @Query(value="select * from employees where employee_id=:empId", nativeQuery=true)
     public  Employee  collectEmployeeById(Integer empId);
                
     //HQL.................................................................
     @ Query(value="From Employee")
 	public List<Employee>collectAllHQLEmployees();
      
     @Query(value="select * from employees where employee_id=:empId", nativeQuery=true)
     public  Employee  collectHQLEmployeeById(Integer empId);
     
     @Transactional()
     @Modifying
     
     @Query(value=" delete from employees where employee_id=:empId", nativeQuery=true)
     public  void  deleteHQLEmployeeById(Integer empId);
     
     @Query(value="select  name ,email,gender from employees" ,nativeQuery=true )
    // public List<Employee>collectFewEmployeeColumn();//not ok
     public List<Object[]>collectFewEmployeeColumn();//ok
     
     @Transactional()
     @Modifying
     @Query(value="update employees set name= :emname  where employee_id=:emid",nativeQuery=true)
     public void updateEmployee(Integer emid,String emname);
     
     
     
}
