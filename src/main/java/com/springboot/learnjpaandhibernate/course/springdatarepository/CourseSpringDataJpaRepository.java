package com.springboot.learnjpaandhibernate.course.springdatarepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	Course findByAuthor(String author);
}
