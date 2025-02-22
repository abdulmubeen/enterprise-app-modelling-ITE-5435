package com.abdulmubeen.sep.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(String cardNumber, String cardHolder, String expiryDate, String cvv, double amount) {

        return true;
    }
}