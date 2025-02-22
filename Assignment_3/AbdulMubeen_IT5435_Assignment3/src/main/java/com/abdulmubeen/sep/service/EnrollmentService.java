package com.abdulmubeen.sep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdulmubeen.sep.model.Enrollment;
import com.abdulmubeen.sep.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public Enrollment updateEnrollmentStatus(int applicationNo, String status) {
        Enrollment enrollment = enrollmentRepository.findById(applicationNo).orElse(null);
        if (enrollment != null) {
            enrollment.setStatus(status);
            return enrollmentRepository.save(enrollment);
        }
        return null;
    }

    public Enrollment findEnrollmentById(int applicationNo) {
        return enrollmentRepository.findById(applicationNo).orElse(null);
    }
}