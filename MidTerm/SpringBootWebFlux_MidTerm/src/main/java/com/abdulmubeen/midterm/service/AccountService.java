package com.abdulmubeen.midterm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdulmubeen.midterm.model.Checking;
import com.abdulmubeen.midterm.model.Savings;
import com.abdulmubeen.midterm.repository.CheckingRepository;
import com.abdulmubeen.midterm.repository.SavingsRepository;

import reactor.core.publisher.Mono;

@Service
public class AccountService {

    @Autowired
    private CheckingRepository checkingRepository;

    @Autowired
    private SavingsRepository savingsRepository;

    // Checking Account CRUD operations
    public Mono<Checking> createChecking(Checking checking) {
        return checkingRepository.save(checking);
    }

    public Mono<Checking> getChecking(String id) {
        return checkingRepository.findById(id);
    }

    public Mono<Void> deleteChecking(String id) {
        return checkingRepository.deleteById(id);
    }

    // Savings Account CRUD operations
    public Mono<Savings> createSavings(Savings savings) {
        return savingsRepository.save(savings);
    }

    public Mono<Savings> getSavings(String id) {
        return savingsRepository.findById(id);
    }

    public Mono<Void> deleteSavings(String id) {
        return savingsRepository.deleteById(id);
    }
}