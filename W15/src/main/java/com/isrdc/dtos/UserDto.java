package com.isrdc.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

public class UserDto {
@Positive(message="Rank can not be negative")
//@Negative(message="Rank can not be positive")
@NotNull(message="Rank is mandatory")
private Integer rank;

	
@NotEmpty(message="name field is mandatory")
@Size(min=1,max=12  ,message="minimum character 1 and maximum 12 charcter can be used")
@Pattern(regexp="[A-Za-z ]{9}" ,message="Name can includes only Alphabet and spaces")
private String name;

@Email
@NotEmpty(message="Email  is mandatory")
private String email;

@NotNull(message="Age is mandatory field")
@Min(value=12 ,  message=" minimum  value is  12")
@Max(value=35,message="  maximum  value is 30" )
private Integer age;

@NotEmpty(message="phone  is mandatory  field")
@Size(min=1,max=10)
private String phone;

@NotNull(message="gender is mandatory field")
private Character gender;

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
public Character getGender() {
	return gender;
}
public void setGender(Character gender) {
	this.gender = gender;
}




public Integer getRank() {
	return rank;
}
public void setRank(Integer rank) {
	this.rank = rank;
}
@Override
public String toString() {
	return "UserDto [name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + ", gender=" + gender
			+ "]";
}


}
