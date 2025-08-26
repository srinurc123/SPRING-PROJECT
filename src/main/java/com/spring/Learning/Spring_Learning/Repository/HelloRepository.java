package com.spring.Learning.Spring_Learning.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.Learning.Spring_Learning.Model.Student;

@Repository
public interface HelloRepository extends JpaRepository<Student, Integer> {

    Optional<Student> getByName(String name); // or findByName
	
	
}
