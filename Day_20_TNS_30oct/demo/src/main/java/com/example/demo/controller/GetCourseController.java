package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/courses")
public class GetCourseController {

	private final CourseService courseService;

	public GetCourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping("/{courseId}")
	public ResponseEntity<Course> getCourse(@PathVariable Long courseId) {
		return courseService.getCourseById(courseId)
				.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
}
