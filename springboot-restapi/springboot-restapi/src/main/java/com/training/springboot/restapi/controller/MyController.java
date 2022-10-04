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

import com.training.springboot.restapi.entities.Course;
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
	public List<Course>getCourses()
	{
return this.courseService.getCourses();
    }
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable long courseId){
		return this.courseService.getCourse(courseId);
		}

	@PostMapping("/courses")                               
     public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
}
	
	@PutMapping("/update")
		public Course updateCourse (@RequestBody Course course) {
			return this.courseService.updateCourse(course);
	}
	//delete the course
		@DeleteMapping("/deletecourses/{courseId}")
		public Course deleteCourse(@PathVariable int id) {
			return this.courseService.deleteCourse(id);	
			
		}
		
			}

