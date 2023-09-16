package com.pro.productpro.controller;

import com.pro.productpro.model.Customer;
import com.pro.productpro.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerRepository repository;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    @GetMapping("/customers/{id}")
    public int getCustomer(@PathVariable int id) {
        return id;
    }

}
