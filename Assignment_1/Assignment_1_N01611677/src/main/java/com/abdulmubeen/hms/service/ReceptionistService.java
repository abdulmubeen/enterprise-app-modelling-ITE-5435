package com.abdulmubeen.hms.service;

import com.abdulmubeen.hms.model.Guest;

public interface ReceptionistService {
	void addRecord(Guest guest);
	void bookRoom(Guest guest);
	void generateBill(Guest guest);
}
