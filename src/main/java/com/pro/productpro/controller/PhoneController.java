package com.pro.productpro.controller;

import com.pro.productpro.model.Phone;
import com.pro.productpro.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhoneController {
    @Autowired
    PhoneRepository repository;

    @GetMapping("/phones")
    public List<Phone> getPhones() {
        return repository.findAll();
    }

}
