package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entites.Employees;

public interface EmployeeRepo extends JpaRepository<Employees, Integer> {

}
