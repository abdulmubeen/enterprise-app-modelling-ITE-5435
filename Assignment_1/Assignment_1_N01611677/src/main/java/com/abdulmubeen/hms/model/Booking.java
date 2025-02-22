package com.abdulmubeen.hms.model;

import java.util.Date;

public class Booking {
	private int booking_id;
    private int guest_id;
    private Date start_date;
    private Date end_date;
    private int bill_id;

    public Booking() {}

    public Booking(int booking_id, int guest_id, Date start_date, Date end_date, int bill_id) {
        this.booking_id = booking_id;
        this.guest_id = guest_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.bill_id = bill_id;
    }

    // Getters and Setters
    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", guest_id=" + guest_id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", bill_id=" + bill_id +
                '}';
    }
	
}