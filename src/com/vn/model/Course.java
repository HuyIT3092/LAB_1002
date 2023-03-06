package com.vn.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vn.abstracts.Statistic;

public class Course implements Serializable, Statistic {
	private static final long serialVersionUID = -1236065101745136065L;
	
	private String id;
	private String title;
	public List<Student> students = new ArrayList<>();
	private Double credit;
	private Integer enrollment;

	public Course() {
		super();
	}

	public Course(String id, String title, List<Student> students, Double credit, Integer enrollment) {
		super();
		this.id = id;
		this.title = title;
		this.students = students;
		this.credit = credit;
		this.enrollment = enrollment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Integer getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Integer enrollment) {
		this.enrollment = enrollment;
	}

	@Override
	public Map<String, List<Student>> getStatistic() {
		return null;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", enrollment=" + enrollment + ", credit=" + credit
				+ ", student=" + students + "]";
	}
	
	

}
