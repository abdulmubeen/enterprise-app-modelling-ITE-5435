package com.abdulmubeen.midterm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abdulmubeen.midterm.model.Checking;
import com.abdulmubeen.midterm.model.Savings;
import com.abdulmubeen.midterm.service.AccountService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/checking")
    public Mono<Checking> createChecking(@RequestBody Checking checking) {
        return accountService.createChecking(checking);
    }

    @GetMapping("/checking/{id}")
    public Mono<Checking> getChecking(@PathVariable String id) {
        return accountService.getChecking(id);
    }

    @DeleteMapping("/checking/{id}")
    public Mono<Void> deleteChecking(@PathVariable String id) {
        return accountService.deleteChecking(id);
    }

    @PostMapping("/savings")
    public Mono<Savings> createSavings(@RequestBody Savings savings) {
        return accountService.createSavings(savings);
    }

    @GetMapping("/savings/{id}")
    public Mono<Savings> getSavings(@PathVariable String id) {
        return accountService.getSavings(id);
    }

    @DeleteMapping("/savings/{id}")
    public Mono<Void> deleteSavings(@PathVariable String id) {
        return accountService.deleteSavings(id);
    }
}