package com.abdulmubeen.midterm.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.abdulmubeen.midterm.model.Checking;

@Repository
public interface CheckingRepository extends ReactiveMongoRepository<Checking, String> {
	
}