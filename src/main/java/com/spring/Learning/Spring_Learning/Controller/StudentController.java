package com.spring.Learning.Spring_Learning.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.Learning.Spring_Learning.Exception.StudentNotFound;
import com.spring.Learning.Spring_Learning.Model.Student;
import com.spring.Learning.Spring_Learning.Service.HelloService;

@RestController
public class StudentController {

    @Autowired
    private HelloService service;

    @PostMapping("/StudentDetails")
    public Student saveDetails(@RequestBody Student s) {
        return service.saveDetails(s);
    }
    
        @GetMapping("/allStudentDetails")
        public List<Student> fetchStudentList() {
            return service.fetchStudentList();
        
    }
        @GetMapping("/Student/id/{id}")
        public Student getStudentById(@PathVariable("id") Integer sId) throws StudentNotFound {
        	return service.getStudentById(sId);
        }
        
        @GetMapping("/Student/name/{name}")
        public Student getStudentByName(@PathVariable("name") String sName) {
        	return service.getStudentByName(sName);
        }
        
        @DeleteMapping("/Student/id/{id}")
        public String deleteStudentById(@PathVariable("id") Integer sId) {
        	service.deleteStudentById(sId);
        	return "deleted successfully";
        }
        
        @PutMapping("/Student/id/{id}")
        public Student updateStudent (@PathVariable("id") Integer sId, @RequestBody Student s) {
        	return service.updateStudent(sId, s);
        }
      
}
