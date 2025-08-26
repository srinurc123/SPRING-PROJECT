package com.spring.Learning.Spring_Learning.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Learning.Spring_Learning.Exception.StudentNotFound;
import com.spring.Learning.Spring_Learning.Model.Student;
import com.spring.Learning.Spring_Learning.Repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloRepository hr;
	
	@Override
	public Student saveDetails(Student s) {
		// TODO Auto-generated method stub
		return hr.save(s) ;
	}

	@Override
	public List<Student> fetchStudentList() {
	    return hr.findAll(); // Assuming hr is a JPA repository (e.g., JpaRepository<Student, Long>)
	}

	@Override
	public Student getStudentById(Integer sId) throws StudentNotFound {
		Optional<Student> s= hr.findById(sId);
	

	    if (!s.isPresent()) {
	    	throw new StudentNotFound ("Student not available check once");
	    }
	    return s.get();
	}

	@Override
	public Student getStudentByName(String sName) {
	    return hr.getByName(sName).orElse(null); // or throw a custom exception
	
	}

	@Override
	public void deleteStudentById(Integer sId) {
		 hr.deleteById(sId);
		
	}


	@Override
	public Student updateStudent(Integer id, Student s ) {
	    Student existingStudent = hr.findById(id)
	        .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));

	    existingStudent.setName(s.getName());
	    existingStudent.setTech(s.getTech());

	    return hr.save(existingStudent);
	}

	@Override
	public Object saveStudent(Student any) {
		// TODO Auto-generated method stub
		return null;
	}



	
	 

	
	
	
	
	
	
	
	
	

}
