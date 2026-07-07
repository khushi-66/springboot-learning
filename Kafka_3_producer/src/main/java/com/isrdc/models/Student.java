package com.isrdc.models;

public class Student {

	private String name;
	private String college;
	private Integer studentId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", college=" + college + ", studentId=" + studentId + "]";
	}
	

}
