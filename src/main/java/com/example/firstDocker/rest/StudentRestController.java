package com.example.firstDocker.rest;

import com.example.firstDocker.model.Student;
import com.example.firstDocker.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
