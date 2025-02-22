package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Member {
	
	@Id
    private String memberId;
    private String name;
    private String address;
    private String membType;
    private LocalDateTime membDate;
    private LocalDateTime expiryDate;

    // Getters and Setters
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getMembType() { return membType; }
    public void setMembType(String membType) { this.membType = membType; }

    public LocalDateTime getMembDate() { return membDate; }
    public void setMembDate(LocalDateTime membDate) { this.membDate = membDate; }

    public LocalDateTime getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDateTime expiryDate) { this.expiryDate = expiryDate; }
}
