package com.spring.Learning.Spring_Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Learning.Spring_Learning.Model.Student;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
	SpringApplication.run(SpringLearningApplication.class, args);
	//Student s = context.getBean(Student.class);
//	s.setId(12);
//	s.setName("srinu");
//	s.setTech("java");
	
	}

}
