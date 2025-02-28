package com.abdulmubeen.midterm.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "checking")
public class Checking implements Account {

    @Id
    private String id;
    private String accountholder;
    private double balance;
    private double insufficientFundFee;

    public Checking(String accountholder, double balance, double insufficientFundFee) {
        this.accountholder = accountholder;
        this.balance = balance;
        this.insufficientFundFee = insufficientFundFee;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            this.balance -= insufficientFundFee;
        }
    }

    @Override
    public void updateBalance(double newBalance) {
        this.balance = newBalance;
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
