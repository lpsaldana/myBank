package com.mybank.customer.controller;

import com.mybank.customer.entities.Customer;
import com.mybank.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }

    @GetMapping("/find/{userId}")
    public ResponseEntity<?> findByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(customerService.findByUserId(userId));
    }

    @GetMapping("/list")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(customerService.findAll());
    }

    @GetMapping("/find-accounts/{customerId}")
    public ResponseEntity<?> findCustomerAccounts(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.findCustomerAccounts(customerId));
    }


}
