package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Publisher;

@Repository
public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {
	
}
