package com.springbootstarter;

import org.springframework.data.repository.CrudRepository;

import com.springbootstarter.dto.CourseDto;

public interface CourseRepository extends CrudRepository<CourseDto, Integer> {
	
   	

}
