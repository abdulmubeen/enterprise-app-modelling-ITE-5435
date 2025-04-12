package com.amm.spring.finalex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.amm.spring.finalex.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}