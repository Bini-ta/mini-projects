package com.training.springboot.restapi.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.restapi.entities.course;
import com.training.springboot.restapi.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	private Object CourseService;
	
	@GetMapping("/home")
	public String home() {
		return"welcome to courses application";
	}
	
	//get the single courses
	@GetMapping("/courses")
	public List<course>getCourses()
	{
return this.courseService.getCourses();
    }
	
	@GetMapping("/courses/{courseId}")
	public course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));}
	//add course
	@PostMapping("/courses")
     public course addCourse(@RequestBody course course) {
		return this.CourseService.addCourse(course);
		}
	//update course using put request
		@PutMapping("/update")
		public course updateCourseService (@RequestBody course course) {
			Return this.courseService.UpdateCourse(course);
	}
	//delete the course
		@DeleteMapping("/deletecourses/{courseId}")
		public void deleteCourse(@PathVariable int id) {
			CourseService.deleteCourse(id);		
		}
		
			}

