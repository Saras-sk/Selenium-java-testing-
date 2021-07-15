package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;

@RestController
public class MyController {
	
	@Autowired= True	
	private CourseService CourseService;
	
	@GetMapping("/home")
	public String home() {
		return "This is a home page";
		
	}
      
	
	//get the courses
	@GetMapping("/Courses")
	public List<Course>getCourses()
	{
		return this.CourseService.getCourses;
		
	}
}
