package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model.Books;
import com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.service.BooksService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    // Get all books
    @GetMapping
    public Flux<Books> getAll() {
        System.out.println("Fetching all books");
        return booksService.getAll();
    }

    // Get book by ID
    @GetMapping("/{id}")
    public Mono<Books> getById(@PathVariable String id) {
        System.out.println("Fetching book with ID: " + id);
        System.out.println(booksService.getById(id));
        return booksService.getById(id);
    }

    // Add a new book
    @PostMapping
    public Mono<Books> addBook(@RequestBody Books book) {
        System.out.println("Adding a new book");
        return booksService.saveBook(book);
    }

    // Delete a book by ID
    @DeleteMapping("/{id}")
    public Mono<Void> deleteBook(@PathVariable String id) {
        System.out.println("Deleting book with ID: " + id);
        return booksService.deleteById(id);
    }

}