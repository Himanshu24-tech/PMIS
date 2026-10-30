package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {

	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public Course createCourse(Course course) {
		course.setId(null);
		return courseRepository.save(course);
	}

	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public Optional<Course> getCourseById(Long courseId) {
		return courseRepository.findById(courseId);
	}

	public Optional<Course> updateCourse(Long courseId, Course courseDetails) {
		return courseRepository.findById(courseId).map(course -> {
			course.setTitle(courseDetails.getTitle());
			course.setDescription(courseDetails.getDescription());
			return courseRepository.save(course);
		});
	}

	public boolean deleteCourse(Long courseId) {
		if (!courseRepository.existsById(courseId)) {
			return false;
		}

		courseRepository.deleteById(courseId);
		return true;
	}
}
