package com.abdulmubeen.hms.model;

public class Receptionist {
	private int rec_id;
    private String rec_password;
    private String phone;
    private String email;

    public Receptionist() {}

    public Receptionist(int rec_id, String rec_password, String phone, String email) {
        this.rec_id = rec_id;
        this.rec_password = rec_password;
        this.phone = phone;
        this.email = email;
    }

    // Getters and Setters
    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public String getRec_password() {
        return rec_password;
    }

    public void setRec_password(String rec_password) {
        this.rec_password = rec_password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "rec_id=" + rec_id +
                ", rec_password='" + rec_password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
