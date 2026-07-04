package com.isrdc.dtos;

public class Userdto {
 private String name;
 private Integer age;
 private String college;
 private Float marks;
 
 
 @Override
public String toString() {
	return "Userdto [name=" + name + ", age=" + age + ", college=" + college + ", marks=" + marks + ", getName()="
			+ getName() + ", getAge()=" + getAge() + ", getCollege()=" + getCollege() + ", getMarks()=" + getMarks()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
 public String getCollege() {
	return college;
 }
 public void setCollege(String college) {
	this.college = college;
 }
 public Float getMarks() {
	return marks;
 }
 public void setMarks(Float marks) {
	this.marks = marks;
 }
 
 
}
