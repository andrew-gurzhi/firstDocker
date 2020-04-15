package com.example.firstDocker;

import com.example.firstDocker.model.Student;
import com.example.firstDocker.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class Stub {
    @Autowired
    StudentRepository studentRepository;


    private void init() {
        List<Student> list = new ArrayList<>();
        Student one = new Student("Vova Baton", "Alcogolicheskiy");
        Student second = new Student("Gena Beton", " Ukurcheskiy");
        list.add(one);
        list.add(second);
        studentRepository.saveAll(list);

    }
}
