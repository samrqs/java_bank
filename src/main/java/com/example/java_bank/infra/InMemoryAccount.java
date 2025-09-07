package com.example.java_bank.infra;

import com.example.java_bank.domain.Account;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryAccount {
    private final ConcurrentHashMap<String, Account> db = new ConcurrentHashMap<>();

    public Optional<Account> findById(String id) {
        return Optional.ofNullable(db.get(id));
    }

    public void save(Account acc) {
        db.put(acc.getAccountId(), acc);
    }

    public void clear() {
        db.clear();
    }
}

