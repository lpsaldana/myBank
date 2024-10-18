package com.mybank.customer.services;

import com.mybank.customer.entities.Person;
import com.mybank.customer.http.responses.PersonAccountsResponse;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<Person> findAll();

    Optional<Person> findByUserId(Long userId);

    void createPerson(Person person);

    PersonAccountsResponse findPersonAccounts(Long personId);
}
