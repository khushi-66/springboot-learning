package com.isrdc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Employee;

import com.isrdc.entities.Employee;

public interface EmployeeRepo  extends CrudRepository<Employee, Integer>{
    public Employee findByEmail(String email) ;
    public List<Employee>findByGender(Character gender);
    public List<Employee>findByGenderAndCountry(Character gender,String country);
    public List<Employee>findBySalaryGreaterThan(Integer salary);
    public List<Employee>findByEmailContains(String token);
    public List<Employee>findByAgeBetween(Integer from,Integer to);
    public List<Employee>findByCountryEndingWith(String n);
    public List<Employee>findByEmployeeIdIn(List<Integer>id);
    public List<Employee>findBySalaryOrderBy();
}
