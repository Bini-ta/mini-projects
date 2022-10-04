package com.training.springboot.restapi.services;

import java.util.ArrayList;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.training.springboot.restapi.entities.Course;

@Service

public class CourseServiceimpl implements CourseService {
	
	List<Course>list;
	public CourseServiceimpl() {
		list= new ArrayList<>();
		list.add(new Course(1,"learning springboot","api application"));
		list.add(new Course(2,"api application","annotations"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse (long courseId) {
		Course c =null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		// TODO Auto-generated method stub
		return c;
	}

	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(equals->{
			if(course.getId()==course.getId()) {
				course.setTitle(course.getTitle());
				course.setDescription(course.getDescription());
			}
		});
		return course;
	}
	@Override
	public Course deleteCourse(int id) {
		list.stream().filter(e->e.getId().collect(Collectors.toList()));
		return list;
}
		
	

}
