package com.spring.Learning.Spring_Learning.RepositoryTest;

import com.spring.Learning.Spring_Learning.Model.Student;
import com.spring.Learning.Spring_Learning.Repository.HelloRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class HelloRepositoryTest {

    @Autowired
    private HelloRepository helloRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Student s = Student.builder()
                .sName("Java Backend")
                .sTech("Hibernate")
                .build();

        entityManager.persist(s);
    }

    @Test
    void testFindById() {
        Optional<Student> result = helloRepository.findById(sId);
        assertTrue(result.isPresent());

        Student s = result.get();
        assertEquals("Java Backend", s.getName());
        assertEquals("Hibernate", s.getTech());
    }
}
