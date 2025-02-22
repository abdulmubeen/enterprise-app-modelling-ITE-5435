package com.abdulmubeen.hms.service;

import com.abdulmubeen.hms.model.Guest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReceptionistServiceImplementor implements ReceptionistService {
	
	private List<Guest> bookedGuests = new ArrayList<>();
	private List<Guest> bookedRooms = new ArrayList<>();

    @Override
    public void addRecord(Guest guest) {
        bookedGuests.add(guest);
    }

    @Override
    public void bookRoom(Guest guest) {
        bookedRooms.add(guest);
    }

    @Override
    public void generateBill(Guest guest) {
        System.out.println("Generating bill for guest: " + guest.getGuest_name() + " with ID: " + guest.getGuest_id());
    }
}
