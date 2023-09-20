package com.pro.productpro.controller;

import com.pro.productpro.model.Customer;
import com.pro.productpro.model.Phone;
import com.pro.productpro.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@Slf4j
public class CustomerController {
    @Autowired
    CustomerRepository repository;

    @GetMapping
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public int getCustomer(@PathVariable int id) {
        return id;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        for (Phone phone : customer.getPhones()) {
            log.info("Customer's phone " + phone);
            phone.setCustomer(customer);
        }
        return repository.save(customer);
    }

}
