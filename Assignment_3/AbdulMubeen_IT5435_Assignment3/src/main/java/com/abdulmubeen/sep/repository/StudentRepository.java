package com.abdulmubeen.sep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdulmubeen.sep.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByUserNameAndPassword(String userName, String password);
}