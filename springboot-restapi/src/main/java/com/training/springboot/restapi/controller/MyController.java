package com.training.springboot.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.restapi.entities.course;
import com.training.springboot.restapi.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home() {
		return"welcome to courses application";
	}
	//get the courses
	@GetMapping("/courses")
	public List<course>getCourses()
	{
return this.courseService.getCourses();
    }
	@GetMapping("/course/{courseId}")
	public CourseService getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	
	
	
	
	
}