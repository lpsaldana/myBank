package com.mybank.customer_portfolio.services;


import com.mybank.customer_portfolio.entities.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    void createAccount(Account account);

    Account getAccountById(Long id);

    List<Account> getPersonAccounts(Long personId);
}
