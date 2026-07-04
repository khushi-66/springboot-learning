package com.isrdc.dtos;

import jakarta.validation.constraints.NotEmpty;

public class UserDto {
@NotEmpty(message="Name is mandatory")
private String name;
private String email;
private Integer age;
private String phone;


@Override
public String toString() {
	return "UserDto [name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}


}
