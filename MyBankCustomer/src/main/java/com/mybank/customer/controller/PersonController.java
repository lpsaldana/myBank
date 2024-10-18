package com.mybank.customer.controller;

import com.mybank.customer.entities.Person;
import com.mybank.customer.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPerson(@RequestBody Person person){
        personService.createPerson(person);
    }

    @GetMapping("/find/{userId}")
    public ResponseEntity<?> findByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(personService.findByUserId(userId));
    }

    @GetMapping("/list")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/find-accounts/{userId}")
    public ResponseEntity<?> findPersonAccounts(@PathVariable Long personId){
        return ResponseEntity.ok(personService.findByUserId(personId));
    }


}
