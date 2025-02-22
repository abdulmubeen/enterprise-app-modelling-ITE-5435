package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Books {
	
	@Id
    private String bookId;
    private String author;
    private String title;
    private double price;
    private String available;

    private List<Member> borrowedBy; 

    private Publisher publisher;

    private LocalDateTime membershipDate;
    private LocalDateTime returnDate;

    // Getters and Setters
    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getAvailable() { return available; }
    public void setAvailable(String available) { this.available = available; }

    public List<Member> getBorrowedBy() { return borrowedBy; }
    public void setBorrowedBy(List<Member> borrowedBy) { this.borrowedBy = borrowedBy; }

    public Publisher getPublisher() { return publisher; }
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public LocalDateTime getMembershipDate() { return membershipDate; }
    public void setMembershipDate(LocalDateTime membershipDate) { this.membershipDate = membershipDate; }

    public LocalDateTime getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDateTime returnDate) { this.returnDate = returnDate; }
}
