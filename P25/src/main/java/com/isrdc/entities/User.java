  package com.isrdc.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
 private String  name;
 private Integer age;
 private String email;
 private String address;
 @OneToOne(mappedBy="user",cascade=CascadeType.ALL)
 private Adhaar aadhar;
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer userId;

 
 
 public Adhaar getAadhar() {
	return aadhar;
}

 public void setAadhar(Adhaar aadhar) {
	this.aadhar = aadhar;
 }

 public User() {
	super();
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

 public String getEmail() {
	return email;
 }

 public void setEmail(String email) {
	this.email = email;
 }

 public String getAddress() {
	return address;
 }

 public void setAddress(String address) {
	this.address = address;
 }

 public Integer getUserId() {
	return userId;
 }

 public void setUserId(Integer userId) {
	this.userId = userId;
 }
 
}
