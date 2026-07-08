package com.isrdc.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer empid;
 private String name;
 private String phone;
 private Integer salary;
 private String password;
 private String city;
 private String email;
 
 public Integer getEmpId() {
     return empid;
 }

 public void setEmpId(Integer empid) {   
     this.empid = empid;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public String getPhone() {
	return phone;
 }
 public void setPhone(String phone) {
	this.phone = phone;
 }
 public Integer getSalary() {
	return salary;
 }
 public void setSalary(Integer salary) {
	this.salary = salary;
 }
 public String getPassword() {
	return password;
 }
 public void setPassword(String password) {
	this.password = password;
 }
 public String getCity() {
	return city;
 }
 public void setCity(String city) {
	this.city = city;
 }
 public String getEmail() {
	return email;
 }
 public void setEmail(String email) {
	this.email = email;
 }
 
	

}
