package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository courseJdbcRepository;
	
	@Autowired
	private CourseJpaRepository courseJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		courseJdbcRepository.insert(new Course(1,"Learn AWS", "in28minutes"));
//		courseJdbcRepository.insert(new Course(2,"learn cpp", "cppnuts"));
//		courseJdbcRepository.deleteById(1);
//		System.out.println(courseJdbcRepository.findById(2));
//		
		
		courseJpaRepository.insert(new Course(1,"Learn AWS", "in28minutes"));
		courseJpaRepository.insert(new Course(2,"learn cpp", "cppnuts"));
		courseJpaRepository.delete(1);
		System.out.println(courseJpaRepository.findById(2));
	}

}
