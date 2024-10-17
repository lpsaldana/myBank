package com.mybank.customer.services;

import com.mybank.customer.entities.Person;
import com.mybank.customer.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl  implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Optional<Person> findByUserId(Long userId) {
        return personRepository.findByUserId(userId);
    }
}
