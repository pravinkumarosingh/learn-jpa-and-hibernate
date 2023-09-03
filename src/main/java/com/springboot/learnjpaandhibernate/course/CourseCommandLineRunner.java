package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
//import com.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
//import com.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.springboot.learnjpaandhibernate.course.springdatarepository.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository courseJdbcRepository;
	
	@Autowired
	private CourseJpaRepository courseJpaRepository;
//	
	@Autowired
	private CourseSpringDataJpaRepository courseSpringDataJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		courseJdbcRepository.insert(new Course(1,"Learn AWS", "in28minutes"));
//		courseJdbcRepository.insert(new Course(2,"learn cpp", "cppnuts"));
//		courseJdbcRepository.deleteById(1);
//		System.out.println(courseJdbcRepository.findById(2));
//		
		
//		courseJpaRepository.insert(new Course(1,"Learn AWS", "in28minutes",'Y'));
//		courseJpaRepository.insert(new Course(2,"learn cpp", "cppnuts",'N'));
//		courseJpaRepository.insert(new Course(3, "learn angular", "in28minutes",'Y'));
//		courseJpaRepository.delete(1);
//		System.out.println(courseJpaRepository.findById(2));
		
//		Course course = courseJpaRepository.findById(1);
//		course.setName(null);
//		courseJpaRepository.insert(course);
		
//		Course course = courseJpaRepository.findById(3);
//		if(course.getIsPublished()!='N') {
//			System.out.println("ready to sale");
//		} else {
//			System.out.println("not ready to sale");
//		}
		
		courseSpringDataJpaRepository.save(new Course(1,"Learn AWS", "in28minutes",'Y'));
		courseSpringDataJpaRepository.save(new Course(2,"learn cpp", "cppnuts",'N'));
		courseSpringDataJpaRepository.save(new Course(3, "learn angular", "in28minutes",'Y'));
		courseSpringDataJpaRepository.deleteById(1l);
		System.out.println(courseSpringDataJpaRepository.findById(3l));
		System.out.println(courseSpringDataJpaRepository.findAll());
		System.out.println(courseSpringDataJpaRepository.findByAuthor("cppnuts"));
		Course course = courseSpringDataJpaRepository.findByAuthor("in28minutes");
		if(course.getIsPublished()!='N') {
			System.out.println("Ready to publish");
		}
		else {
			System.out.println("not ready to publish");
		}
	}

}
