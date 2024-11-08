package com.mybank.customer_portfolio.services;


import com.mybank.customer_portfolio.entities.Account;

import java.util.List;

public interface AccountService {
    void createAccount(Account account);

    Account getAccountById(Long id);

    List<Account> getCustomerAccounts(Long customerId);
}
