package com.abdulmubeen.hms.model;

public class Guest {
	private int guest_id;
    private String guest_name;
    private String contact;
    private String email;
    private String address;

    public Guest() {}

    public Guest(int guest_id, String guest_name, String contact, String email, String address) {
        this.guest_id = guest_id;
        this.guest_name = guest_name;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guest_id=" + guest_id +
                ", guest_name='" + guest_name + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
