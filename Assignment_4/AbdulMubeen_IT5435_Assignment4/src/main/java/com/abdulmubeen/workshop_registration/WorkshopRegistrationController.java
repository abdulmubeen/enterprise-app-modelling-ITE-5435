package com.abdulmubeen.workshop_registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;


@Controller
@RequestMapping("/")
public class WorkshopRegistrationController {

    @Autowired
    private WorkshopRegistrationService registrationService;

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new WorkshopRegistration());
        return "index";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("registration") WorkshopRegistration registration,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index";
        }

        registrationService.save(registration);

        model.addAttribute("message", "Registration successful!");
        return "index";
    }

    @PostMapping("/reset")
    public String resetForm(Model model) {
        model.addAttribute("registration", new WorkshopRegistration());
        return "index";
    }
}