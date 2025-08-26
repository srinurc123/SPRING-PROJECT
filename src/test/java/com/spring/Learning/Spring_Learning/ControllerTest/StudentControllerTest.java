package com.spring.Learning.Spring_Learning.ControllerTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.spring.Learning.Spring_Learning.Controller.StudentController;
import com.spring.Learning.Spring_Learning.Model.Student;
import com.spring.Learning.Spring_Learning.Service.HelloService;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private HelloService service;

    private Student s;

    @BeforeEach
    void setUp() {
        s = Student.builder()
                .id(1) 
                .name("RAGHU")
                .tech("M.P.C")
                .build();
    }

    @Test
    void saveDepartment() throws Exception {
        Student inputStudent = Student.builder()
                .name("RAGHU")
                .tech("M.P.C")
                .build();

        Mockito.when(service.saveStudent(Mockito.any(Student.class)))
                .thenReturn(s);
        mockMvc.perform(post("/Students")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\"sName\": \"RAGHU\",\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    void fetchDepartmentById() throws Exception {
        Mockito.when(service.getStudentById(1))
                .thenReturn(s);

        mockMvc.perform(get("/AllStudent/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())               
                .andExpect(jsonPath("$.sName").value(s.getName()));
    }
}
