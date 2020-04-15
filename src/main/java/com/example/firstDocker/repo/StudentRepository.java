package com.example.firstDocker.repo;

import com.example.firstDocker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
