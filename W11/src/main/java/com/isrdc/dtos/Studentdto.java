package com.isrdc.dtos;

public class Studentdto {
   private String name;
   private Float marks;
   private Integer age;
   private String college;
   
    public Studentdto(String name, Float marks, Integer age, String college) {
	super();
	this.name = name;
	this.marks = marks;
	this.age = age;
	this.college = college;
}
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public Float getMarks() {
	return marks;
   }
   public void setMarks(Float marks) {
	this.marks = marks;
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
   
}
