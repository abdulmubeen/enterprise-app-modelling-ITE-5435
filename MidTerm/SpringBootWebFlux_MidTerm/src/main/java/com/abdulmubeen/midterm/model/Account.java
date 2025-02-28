package com.abdulmubeen.midterm.model;

public interface Account {
    String getAccountholder();
    void setAccountholder(String accountholder);
    double getBalance();
    void setBalance(double balance);
    void deposit(double amount);
    void withdraw(double amount);
    void updateBalance(double newBalance);
}