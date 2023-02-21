package com.foldersandfiles.foldersandfiles.controllers;

import com.foldersandfiles.foldersandfiles.models.Person;
import com.foldersandfiles.foldersandfiles.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(value = "/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
    @GetMapping(value = "/people")
    public ResponseEntity<List<Person>> getAllPeople(@RequestBody Person person){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/people/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }
}