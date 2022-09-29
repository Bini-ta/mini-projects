package com.training.springboot.restapi.services;

import java.util.List;

import com.training.springboot.restapi.entities.course;

public interface CourseService {
	
	public List<course> getCourses();

	public Course getCourse(long courseId);

}
