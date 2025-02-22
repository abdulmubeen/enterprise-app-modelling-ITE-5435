package com.abdulmubeen.sep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdulmubeen.sep.model.Student;
import com.abdulmubeen.sep.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student loginStudent(String userName, String password) {
        return studentRepository.findByUserNameAndPassword(userName, password);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
}