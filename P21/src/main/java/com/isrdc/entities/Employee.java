package com.isrdc.entities;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.repository.Temporal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Employees")
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
	  @CreationTimestamp
	  @Column(updatable=false)
	  private LocalDate registrationDate;
	  
	  @Column(insertable=false)
	  @UpdateTimestamp
	  private LocalDate updationDate;

	  public Integer getEmployeeId() {
		return employeeId;
	}


	  public void setEmployeeId(Integer employeeId) {
		  this.employeeId = employeeId;
	  }


	  public LocalDate getUpdationDate() {
		return updationDate;
	}


	  public void setUpdationDate(LocalDate updationDate) {
		  this.updationDate = updationDate;
	  }


	  public String getName() {
		  return name;
	  }


	  public void setName(String name) {
		  this.name = name;
	  }


	  public String getCountry() {
		  return country;
	  }


	  public void setCountry(String country) {
		  this.country = country;
	  }


	  public Integer getAge() {
		  return age;
	  }


	  public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	  public void setRegistrationDate(LocalDate registrationDate) {
		  this.registrationDate = registrationDate;
	  }


	  public void setAge(Integer age) {
		  this.age = age;
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


	  public String getPassword() {
		  return password;
	  }


	  public void setPassword(String password) {
		  this.password = password;
	  }


	  public String getEmail() {
		  return email;
	  }


	  public void setEmail(String email) {
		  this.email = email;
	  }

public Employee() {
	super();
}
	  public Employee(String name, String country, Integer age, Integer experience, Integer salary, Character gender,
			String password, String email) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
		this.gender = gender;
		this.password = password;
		this.email = email;
		
		
	}
	  
  
}
