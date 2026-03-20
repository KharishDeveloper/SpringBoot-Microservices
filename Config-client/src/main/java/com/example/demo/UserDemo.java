package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Component
@Entity(name = "h1")
public class UserDemo {

	@Id
	public int id;

	@Column(name = "full_name")
	public String fullName;

	public int marks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public UserDemo(int id, String fullName, int marks) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.marks = marks;
	}

	public UserDemo() {
		super();
	}

	@Override
	public String toString() {
		return "UserDemo [id=" + id + ", fullName=" + fullName + ", marks=" + marks + "]";
	}

}
