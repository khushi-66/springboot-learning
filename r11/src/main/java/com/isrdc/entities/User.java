package com.isrdc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="users")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer userId;
private String name;
private Float ratings;
private Integer age;
@Override
public String toString() {
	return "User [userId=" + userId + ", name=" + name + ", ratings=" + ratings + ", age=" + age + "]";
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Float getRatings() {
	return ratings;
}
public void setRatings(Float ratings) {
	this.ratings = ratings;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

}
