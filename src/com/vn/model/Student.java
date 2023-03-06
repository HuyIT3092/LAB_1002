package com.vn.model;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 4553201195648943435L;
	
	private String id;
	private String name;
	private String phone;
	private String gender;
	private Double gpa;

	public Student() {
		super();
	}

	public Student(String id, String name, String phone, String gender, Double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", gender=" + gender + ", gpa=" + gpa
				+ "]";
	}
}
