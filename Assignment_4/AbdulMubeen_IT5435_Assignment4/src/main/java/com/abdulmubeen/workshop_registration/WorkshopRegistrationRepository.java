package com.abdulmubeen.workshop_registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRegistrationRepository extends JpaRepository<WorkshopRegistration, Long> {
}
