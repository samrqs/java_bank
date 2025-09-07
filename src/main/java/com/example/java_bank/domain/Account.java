package com.example.java_bank.domain;

import lombok.Data;

@Data
public class Account {
    private final String accountId;
    private int balance;

    public Account(String accountId, int initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
