package com.spring.Learning.Spring_Learning.Service;

import java.util.List;

import com.spring.Learning.Spring_Learning.Exception.StudentNotFound;
import com.spring.Learning.Spring_Learning.Model.Student;

public interface HelloService {

	public Student saveDetails(Student s);

	public List<Student> fetchStudentList();

	public Student getStudentById(Integer sId) throws StudentNotFound;

	public Student getStudentByName(String sName);

	public void deleteStudentById(Integer sId);

	public Student updateStudent(Integer sId, Student s);

	public Object saveStudent(Student any);



	
	
	
	
	
	
	
	
	
}
