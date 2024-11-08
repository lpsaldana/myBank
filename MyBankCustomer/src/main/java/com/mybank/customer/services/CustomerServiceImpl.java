package com.mybank.customer.services;

import com.mybank.customer.client.PortfolioClient;
import com.mybank.customer.dto.AccountDTO;
import com.mybank.customer.entities.Customer;
import com.mybank.customer.http.responses.CustomerAccountsResponse;
import com.mybank.customer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PortfolioClient portfolioClient;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findByUserId(Long userId) {
        return customerRepository.findByUserId(userId);
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public CustomerAccountsResponse findCustomerAccounts(Long customerId) {
        List<AccountDTO> accountDTOList = portfolioClient.findAllCustomerAccounts(customerId);
        CustomerAccountsResponse customerAccountsResponse = new CustomerAccountsResponse(accountDTOList);
        return customerAccountsResponse;
    }
}
