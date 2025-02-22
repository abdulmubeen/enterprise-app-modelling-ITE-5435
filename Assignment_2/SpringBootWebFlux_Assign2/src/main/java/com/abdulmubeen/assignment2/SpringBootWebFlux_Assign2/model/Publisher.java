package com.abdulmubeen.assignment2.SpringBootWebFlux_Assign2.model;

import org.springframework.data.annotation.Id;

public class Publisher {
	
	@Id
    private String pubId;
    private String address;
    private String name;

    // Getters and Setters
    public String getPubId() { return pubId; }
    public void setPubId(String pubId) { this.pubId = pubId; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
