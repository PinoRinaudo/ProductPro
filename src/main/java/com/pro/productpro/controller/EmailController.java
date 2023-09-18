package com.pro.productpro.controller;

import com.pro.productpro.model.Email;
import com.pro.productpro.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmailController {
    @Autowired
    EmailRepository repository;

    @GetMapping("/emails")
    public List<Email> getEmails() {
        return repository.findAll();
    }

    @GetMapping("/emails/{id}")
    public int getEmail(@PathVariable int id) {
        return id;
    }

}
