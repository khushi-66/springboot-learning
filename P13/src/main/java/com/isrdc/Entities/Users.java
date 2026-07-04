package com.isrdc.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
@Id
private Integer user_Id ;
private String name;
private String password;
private String email;

public Integer getUser_Id() {
	return user_Id;
}
public void setUser_Id(Integer user_Id) {
	this.user_Id = user_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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


}
