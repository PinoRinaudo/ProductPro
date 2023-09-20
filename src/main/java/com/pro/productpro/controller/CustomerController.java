package com.pro.productpro.controller;

import com.pro.productpro.model.Customer;
import com.pro.productpro.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@Slf4j
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping
    public List<Customer> getCustomers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public int getCustomer(@PathVariable int id) {
        return id;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

}
