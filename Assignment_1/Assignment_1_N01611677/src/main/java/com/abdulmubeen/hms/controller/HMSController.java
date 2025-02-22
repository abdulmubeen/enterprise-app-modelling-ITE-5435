package com.abdulmubeen.hms.controller;

import com.abdulmubeen.hms.model.Guest;
import com.abdulmubeen.hms.model.Booking;
import com.abdulmubeen.hms.service.GuestService;
import com.abdulmubeen.hms.service.ReceptionistService;
import com.abdulmubeen.hms.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HMSController {
	
	@Autowired
    private GuestService guestService;

    @Autowired
    private ReceptionistService receptionistService;

    @Autowired
    private BookingService bookingService;

    @PostMapping("/guests")
    public void addGuest(@RequestBody Guest guest) {
        guestService.addGuest(guest);
    }

    @DeleteMapping("/guests/{guestId}")
    public void removeGuest(@PathVariable int guestId) {
        Guest guest = new Guest();
        guest.setGuest_id(guestId);
        guestService.removeGuest(guest);
    }

    @GetMapping("/guests/{guestId}")
    public Guest showGuestDetails(@PathVariable int guestId) {
        Guest guest = new Guest();
        guest.setGuest_id(guestId);
        return guestService.showDetails(guest);
    }

    @PutMapping("/guests")
    public void updateGuest(@RequestBody Guest guest) {
        guestService.updateInfo(guest);
    }

    // Receptionist Operations (Booking)
    @PostMapping("/receptionists/record")
    public void addRecord(@RequestBody Guest guest) {
        receptionistService.addRecord(guest);
    }

    @PostMapping("/receptionists/book")
    public void bookRoom(@RequestBody Guest guest) {
        receptionistService.bookRoom(guest);
    }

    @PostMapping("/receptionists/bill")
    public void generateBill(@RequestBody Guest guest) {
        receptionistService.generateBill(guest);
    }

    // Booking Operations (CRUD)
    @PostMapping("/bookings")
    public void addBooking(@RequestBody Booking booking) {
        bookingService.addBooking(booking);
    }

    @GetMapping("/bookings/{bookingId}")
    public Booking showBookingDetails(@PathVariable int bookingId) {
        Booking booking = new Booking();
        booking.setBooking_id(bookingId);
        return bookingService.bookingDetails(booking);
    }

    @DeleteMapping("/bookings/{bookingId}")
    public void cancelBooking(@PathVariable int bookingId) {
        Booking booking = new Booking();
        booking.setBooking_id(bookingId);
        bookingService.cancelBooking(booking);
    }

    @PutMapping("/bookings")
    public void updateBooking(@RequestBody Booking booking) {
        bookingService.updateBooking(booking);
    }
}