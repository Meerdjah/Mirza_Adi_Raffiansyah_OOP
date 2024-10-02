package com.mirzaAdiRaffiansyahJPlane.service;

import com.mirzaAdiRaffiansyahJPlane.Account;
import com.mirzaAdiRaffiansyahJPlane.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account registerAccount(String username, String password) {
        Account user = new Account(username, password);
        return accountRepository.save(user);
    }

    public List<Account> getAllUsers() {
        return accountRepository.findAll();
    }

    public Account topUpBalance(long accountId, String username, String password, int amount) {
        Account account = accountRepository.findById(accountId).orElseThrow(() -> new RuntimeException("Account not found"));
        account.equals(accountRepository.findById(accountId));
        account.setBalance(account.getBalance() + amount);
        return accountRepository.save(account);
    }
}
