package com.mybank.customer_portfolio.services;

import com.mybank.customer_portfolio.entities.Account;
import com.mybank.customer_portfolio.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public List<Account> getPersonAccounts(Long personId) {
        return accountRepository.findByPersonId(personId);
    }
}
