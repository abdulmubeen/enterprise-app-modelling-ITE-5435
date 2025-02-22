package com.abdulmubeen.sep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdulmubeen.sep.model.Program;

public interface ProgramRepository extends JpaRepository<Program, String> {
	
}
