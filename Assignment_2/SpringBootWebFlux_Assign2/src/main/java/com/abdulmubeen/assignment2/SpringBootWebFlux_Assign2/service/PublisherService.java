package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Publisher;
import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.repository.PublisherRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    // Get all publishers
    public Flux<Publisher> getAll() {
        return publisherRepository.findAll().switchIfEmpty(Flux.empty());
    }

    // Get publisher by ID
    public Mono<Publisher> getById(final String id) {
        return publisherRepository.findById(id);
    }

    // Save or update a publisher
    public Mono<Publisher> savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    // Delete a publisher by ID
    public Mono<Void> deletePublisherById(final String id) {
        return publisherRepository.deleteById(id);
    }
}
