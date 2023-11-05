package com.example.demo.controllers;

import com.example.demo.IPersonRepository;
import com.example.demo.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonsController {
    @Autowired
    IPersonRepository repository;
    @GetMapping("/{id}")
    public Person getPerson(@PathVariable() final int id) {
        return repository.findById(id).get();
    }
}
