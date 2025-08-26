package com.spring.Learning.Spring_Learning.ServiceTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.spring.Learning.Spring_Learning.Model.Student;
import com.spring.Learning.Spring_Learning.Repository.HelloRepository;
import com.spring.Learning.Spring_Learning.Service.HelloService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private HelloService service;

    @MockBean
    private HelloRepository hr;

    @BeforeEach
    void setUp() {
        Student s =
        		Student.builder()
        		.sName("MANI KANTA")
                .sTech("MySQL")
                .sId(1)
                .build();

        Mockito.when(hr.findByStudentNameIgnoreCase("MANI KANTA"))
                .thenReturn(s);

    }

    @Test
    @DisplayName("Get Data based on Valida Department Name")
    public void whenValidStudentName_thenDepartmentShouldFound() {
        String departmentName = "IT";
        Student found =
                service.getStudentByName(sName);

        assertEquals(sName, found.getStudentName());
    }
}