package com.matheuscordeiro.springdocker.controller;

import com.matheuscordeiro.springdocker.domain.Person;
import com.matheuscordeiro.springdocker.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/")
@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping
    public ResponseEntity<List<Person>> list() {
        return ResponseEntity.ok(personRepository.findAll());
    }
}
