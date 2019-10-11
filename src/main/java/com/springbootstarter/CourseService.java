package com.springbootstarter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstarter.dto.CourseDto;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<CourseDto> getAllCourses(){
		List<CourseDto> courses=new ArrayList<>();
		 courseRepository.findAll().forEach(courses::add);
		 return courses;
	}
	
	public CourseDto getCourse(Integer id) {
		return courseRepository.findOne(id);
	}
	
	public void addCourse(CourseDto courseDto) {
		courseRepository.save(courseDto);
	}
	
	
	/* updates if records exist in database otherwise creates a new one
	 * 
	 */
	public void updateCourse(CourseDto courseDto, Integer id) {
		courseRepository.save(courseDto);
	}
	
	public void deleteCourse(Integer id) {
		courseRepository.delete(id);
	}
	
}
