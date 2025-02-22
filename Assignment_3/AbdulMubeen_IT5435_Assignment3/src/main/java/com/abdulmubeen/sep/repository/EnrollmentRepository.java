package com.abdulmubeen.sep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdulmubeen.sep.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
	
}
