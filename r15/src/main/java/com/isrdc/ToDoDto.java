package com.isrdc;

public class ToDoDto {
private String title;
private Integer userId;
private Boolean completed;
private Integer id;
@Override
public String toString() {
	return "ToDoDto [title=" + title + ", userId=" + userId + ", completed=" + completed + ", id=" + id + "]";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public Boolean getCompleted() {
	return completed;
}
public void setCompleted(Boolean completed) {
	this.completed = completed;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

}
