package com.abdulmubeen.midterm.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.abdulmubeen.midterm.model.Savings;

@Repository
public interface SavingsRepository extends ReactiveMongoRepository<Savings, String> {
	
}
