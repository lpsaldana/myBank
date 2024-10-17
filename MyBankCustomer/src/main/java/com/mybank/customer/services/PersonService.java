package com.mybank.customer.services;

import com.mybank.customer.entities.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<Person> findAll();

    Optional<Person> findByUserId(Long userId);
}
