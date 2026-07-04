package com.isrdc.r3;

public class Student {
private String name;
private Integer age;
private Float marks;
private String college;


@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", marks=" + marks + ", college=" + college + "]";
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
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}


}
