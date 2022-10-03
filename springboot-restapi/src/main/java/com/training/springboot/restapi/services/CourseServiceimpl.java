package com.training.springboot.restapi.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.springboot.restapi.entities.course;
@Service
public class CourseServiceimpl implements CourseService {
	
	List<course>list;
	public CourseServiceimpl() {
		list= new ArrayList<>();
		list.add(new course(1,"learning springboot","api application"));
		list.add(new course(2,"api application","annotations"));
	}

	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public course getCourse (long courseId) {
		course c =null;
		for(course course:list)
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

	@Override
	public course addCourse(course course) {
		list.add(course);
		return course;
	}

	@Override
	public course updateCourse(course course) {
		CourseService.UpdateCourse(course);
		return course;
	}

	@Override
	public course deleteCourse(course course) {
		CourseService.deleteCourse(course);
		// TODO Auto-generated method stub
		return course;
	}

}
