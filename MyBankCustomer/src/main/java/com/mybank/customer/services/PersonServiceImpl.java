package com.mybank.customer.services;

import com.mybank.customer.client.PortfolioClient;
import com.mybank.customer.dto.AccountDTO;
import com.mybank.customer.entities.Person;
import com.mybank.customer.http.responses.PersonAccountsResponse;
import com.mybank.customer.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl  implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PortfolioClient portfolioClient;

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Optional<Person> findByUserId(Long userId) {
        return personRepository.findByUserId(userId);
    }

    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public PersonAccountsResponse findPersonAccounts(Long personId) {
        List<AccountDTO> accountDTOList = portfolioClient.findAllPersonAccounts(personId);
        PersonAccountsResponse personAccountsResponse = new PersonAccountsResponse(accountDTOList);
        return personAccountsResponse;
    }
}
