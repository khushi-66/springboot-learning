package com.isrdc.dtos;

public class UserDto {
	
	private Integer userId;
	private String name;
	private Float ratings;
	private Integer age;
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
