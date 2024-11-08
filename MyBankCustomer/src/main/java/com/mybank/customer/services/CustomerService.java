package com.mybank.customer.services;

import com.mybank.customer.entities.Customer;
import com.mybank.customer.http.responses.CustomerAccountsResponse;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> findAll();

    Optional<Customer> findByUserId(Long userId);

    void createCustomer(Customer customer);

    CustomerAccountsResponse findCustomerAccounts(Long customerId);
}
