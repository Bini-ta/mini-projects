package com.training.springboot.restapi.services;

import java.util.List;

import com.training.springboot.restapi.entities.Course;


public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);
	public  Course addCourse(Course course);
	public  Course updateCourse(Course course);
	public Course deleteCourse(int id);
	} 
	