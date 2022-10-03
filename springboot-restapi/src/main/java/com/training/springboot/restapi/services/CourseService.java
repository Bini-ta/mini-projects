package com.training.springboot.restapi.services;

import java.util.List;

import com.training.springboot.restapi.entities.course;

public interface CourseService {
	
	public List<course> getCourses();

	public course getCourse(long courseId);
	public course addCourse(course course);
	public course updateCourse(course course);
	public course deleteCourse(course course); 
	}