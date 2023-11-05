package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public String getPerson(final int id) {
        return "" + id;
    }
}
