package com.example.firstDocker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String faculti;

    public Student() {
    }

    public Student(String name, String faculti) {
        this.name = name;
        this.faculti = faculti;
    }

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

    public String getFaculti() {
        return faculti;
    }

    public void setFaculti(String faculti) {
        this.faculti = faculti;
    }
}
