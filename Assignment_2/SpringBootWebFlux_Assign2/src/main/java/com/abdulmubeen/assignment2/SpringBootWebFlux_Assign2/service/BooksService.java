package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Books;
import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.repository.BooksRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;

    // Get all books
    public Flux<Books> getAll() {
        return booksRepository.findAll().switchIfEmpty(Flux.empty());
    }

    // Get book by ID
    public Mono<Books> getById(final String id) {
        return booksRepository.findById(id);
    }

    // Save a new or update an existing book
    public Mono<Books> saveBook(Books book) {
        return booksRepository.save(book);
    }

    // Delete a book by ID
    public Mono<Void> deleteById(final String id) {
        return booksRepository.deleteById(id);
    }
}
