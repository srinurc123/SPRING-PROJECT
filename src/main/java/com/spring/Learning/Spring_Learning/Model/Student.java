package com.spring.Learning.Spring_Learning.Model;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.Builder;
import lombok.Data;

@Component
@Entity
@Data
@Builder
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or AUTO, SEQUENCE, TABLE
	private int id;

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
//	public Student(int id , String name, String tech) {
//		this.id = id;
//		this.name =name;
//		this.tech = tech;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	private String name;
	private String tech;


	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}


	

	
	

}






