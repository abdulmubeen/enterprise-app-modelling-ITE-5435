package com.amm.spring.finalex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.amm.spring.finalex.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}