package com.xadmin.usermanagement.bean;

public class User {

	public User(String name, String email, String course) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
	}
	public User(int id, String name, String email, String course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
	}
	private int id;
	private String name;
	private String email;
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
