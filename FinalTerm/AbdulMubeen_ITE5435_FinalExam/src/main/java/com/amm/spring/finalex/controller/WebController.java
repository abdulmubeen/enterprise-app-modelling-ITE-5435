package com.amm.spring.finalex.controller;

import com.amm.spring.finalex.model.Reservation;
import com.amm.spring.finalex.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private ReservationRepository reservationRepository;

    // Show the reservation form
    @GetMapping("/reservationForm")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }

    // Process the submitted reservation form
    @PostMapping("/reservationForm")
    public String submitReservationForm(@ModelAttribute Reservation reservation, Model model) {
        Reservation savedReservation = reservationRepository.save(reservation);
        model.addAttribute("reservation", savedReservation);
        return "success";
    }
}