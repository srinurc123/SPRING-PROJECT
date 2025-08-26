package com.spring.Learning.Spring_Learning.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Learning.Spring_Learning.Model.Student;


@RestController
public class NormalController {

	@Autowired
	private Student s;
	
	@GetMapping("/")
	public String home() {
		return "hello world";
	}
	
/*	if we written parameter constructor in model class we use this format for setting values
  @GetMapping("/Student")
	public List<Student> name() {
	Student s1 = new Student(1, "srinu", "java");
	Student s2 = new Student(2, "ram", "C++");
		    return List.of(s1, s2);
	}*/

	@GetMapping("/Student")
	public Student details() {
	s.setId(101);
	s.setName("srinu");
	s.setTech("java");
	return s;

		
	}
	

}
