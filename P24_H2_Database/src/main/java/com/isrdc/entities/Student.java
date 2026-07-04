package com.isrdc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
  private String name;
  private Integer age;
  private Float marks;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer studentId;
  
  
  
  
  public Student(String name, Integer age, Float marks) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
}
  public Student() {
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
  public Float getMarks() {
	return marks;
  }
  public void setMarks(Float marks) {
	this.marks = marks;
  }
  public Integer getStudentId() {
	return studentId;
  }
  public void setStudentId(Integer studentId) {
	this.studentId = studentId;
  }
  
  
}
