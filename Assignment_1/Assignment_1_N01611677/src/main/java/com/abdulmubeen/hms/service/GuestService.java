package com.abdulmubeen.hms.service;

import com.abdulmubeen.hms.model.Guest;

public interface GuestService {
	void addGuest(Guest guest);
	void removeGuest(Guest guest);
	Guest showDetails(Guest guest);
	void updateInfo(Guest guest);
}
