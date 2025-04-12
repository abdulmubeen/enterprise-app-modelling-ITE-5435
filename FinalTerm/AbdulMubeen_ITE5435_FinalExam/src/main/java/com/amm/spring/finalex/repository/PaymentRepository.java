package com.amm.spring.finalex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.amm.spring.finalex.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}