package com.abdulmubeen.midterm.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "savings")
public class Savings implements Account {

    @Id
    private String id;
    private String accountholder;
    private double balance;
    private double interestRate;

    public Savings(String accountholder, double balance, double interestRate) {
        this.accountholder = accountholder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }

    @Override
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void depositMonthlyInterest() {
        double interest = this.balance * (interestRate / 100);
        this.balance += interest;
    }

    @Override
    public String getAccountholder() {
        return accountholder;
    }

    @Override
    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
