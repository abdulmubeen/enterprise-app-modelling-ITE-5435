package com.abdulmubeen.workshop_registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkshopRegistrationService {

    @Autowired
    private WorkshopRegistrationRepository repository;

    public void save(WorkshopRegistration registration) {
        repository.save(registration);
    }
}
