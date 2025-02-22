package com.abdulmubeen.hms.service;

import com.abdulmubeen.hms.model.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceImplementor implements BookingService {
    private List<Booking> bookings = new ArrayList<>();

    @Override
    public Booking bookingDetails(Booking booking) {
       Booking op_booking = bookings.stream()
            .filter(b -> b.getBooking_id() == booking.getBooking_id())
            .findFirst().orElse(null);
       
       return op_booking;
    }

    @Override
    public void cancelBooking(Booking booking) {
        bookings.removeIf(b -> b.getBooking_id() == booking.getBooking_id());
    }

    @Override
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public void updateBooking(Booking booking) {
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getBooking_id() == booking.getBooking_id()) {
                bookings.set(i, booking);
            }
        }
    }
}