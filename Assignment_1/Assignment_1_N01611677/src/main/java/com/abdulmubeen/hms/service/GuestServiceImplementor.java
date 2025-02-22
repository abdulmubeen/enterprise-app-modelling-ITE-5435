package com.abdulmubeen.hms.service;

import com.abdulmubeen.hms.model.Guest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuestServiceImplementor implements GuestService {
	
	private List<Guest> guestList = new ArrayList<>();

    @Override
    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    @Override
    public void removeGuest(Guest guest) {
        guestList.removeIf(g -> g.getGuest_id() == guest.getGuest_id());
    }

    @Override
    public Guest showDetails(Guest guest) {
        Guest op_guest = guestList.stream()
            .filter(g -> g.getGuest_id() == guest.getGuest_id())
            .findFirst().orElse(null);
        
        return op_guest;
        
    }

    @Override
    public void updateInfo(Guest guest) {
        for (int i = 0; i < guestList.size(); i++) {
            if (guestList.get(i).getGuest_id() == guest.getGuest_id()) {
                guestList.set(i, guest);
            }
        }
    }
	
}
