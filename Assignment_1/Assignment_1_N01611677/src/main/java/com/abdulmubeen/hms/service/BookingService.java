package com.abdulmubeen.hms.service;

import com.abdulmubeen.hms.model.Booking;

public interface BookingService {
	Booking bookingDetails(Booking booking);
	void cancelBooking(Booking booking);
	void addBooking(Booking booking);
	void updateBooking(Booking booking);
}
