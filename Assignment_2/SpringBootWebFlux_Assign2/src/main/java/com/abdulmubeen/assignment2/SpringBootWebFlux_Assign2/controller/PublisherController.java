package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Publisher;
import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.service.PublisherService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    // Get all publishers
    @GetMapping
    public Flux<Publisher> getAll() {
        System.out.println("Fetching all publishers");
        return publisherService.getAll();
    }

    // Get publisher by ID
    @GetMapping("/{id}")
    public Mono<Publisher> getById(@PathVariable String id) {
        System.out.println("Fetching publisher with ID: " + id);
        return publisherService.getById(id);
    }

    // Add a new publisher
    @PostMapping
    public Mono<Publisher> addPublisher(@RequestBody Publisher publisher) {
        System.out.println("Adding a new publisher");
        return publisherService.savePublisher(publisher);
    }

    // Delete a publisher by ID
    @DeleteMapping("/{id}")
    public Mono<Void> deletePublisher(@PathVariable String id) {
        System.out.println("Deleting publisher with ID: " + id);
        return publisherService.deletePublisherById(id);
    }

}