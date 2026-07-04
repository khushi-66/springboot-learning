package com.isrdc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer employeeId;
  private String name;
  private String country;
 private Integer age;
  private Integer experience;
  private Integer salary;
  private Character gender;
  private String password;
  private String email;
  
  

  
  
  public Employee() {
	super();
}
  public Employee(String name, Integer age, Integer experience, Integer salary, Character gender, String password,
		String email,String country) {
	super();
	this.country=country;
	this.name = name;
	this.age = age;
	this.experience = experience;
	this.salary = salary;
	this.gender = gender;
	this.password = password;
	this.email = email;
}
  //getters and setters......................
  public Integer getEmployeeId() {
	return employeeId;
  }
  public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public Integer getAge() {
	return age;
  }
  public void setAge(Integer age) {
	this.age = age;
  }
  public String getPassword() {
	return password;
}
  public void setPassword(String password) {
	this.password = password;
  }
  public String getCountry() {
		return country;
	}
	  public void setCountry(String country) {
		this.country = country;
	  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
  public Integer getExperience() {
	return experience;
  }
  public void setExperience(Integer experience) {
	this.experience = experience;
  }
  public Integer getSalary() {
	return salary;
  }
  public void setSalary(Integer salary) {
	this.salary = salary;
  }
  public Character getGender() {
	return gender;
  }
  public void setGender(Character gender) {
	this.gender = gender;
  }
  
  
  
}
