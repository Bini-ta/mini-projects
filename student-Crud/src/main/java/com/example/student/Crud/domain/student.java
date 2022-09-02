package com.example.student.Crud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
	@Column(name = "Name")
    private String Name;
	@Column(name = "Course")
    private String course;
	@Column(name="grade")
    private int grade;
	public student(int id, String name, String course, int grade) {
		super();
		this.id = id;
		this.Name = name;
		this.course = course;
		this.grade = grade;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
