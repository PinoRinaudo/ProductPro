package com.pro.productpro.controller;

import com.pro.productpro.model.Customer;
import com.pro.productpro.model.Email;
import com.pro.productpro.model.Phone;
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
    public Long getCustomer(@PathVariable Long id) {
        return id;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

    @PostMapping("/{id}/phones")
    public Customer addPhone(@PathVariable Long id, @RequestBody List<Phone> phones) {
        return service.addPhones(id, phones);
    }

    @GetMapping("/{id}/phones")
    public List<Phone> getCustomerPhones(@PathVariable Long id) {
        return service.getAllPhonesById(id);
    }


    @PostMapping("/{id}/emails")
    public Customer addEmail(@PathVariable Long id, @RequestBody List<Email> emails) {
        return service.addEmails(id, emails);
    }

    @GetMapping("/{id}/emails")
    public List<Email> getCustomerEmails(@PathVariable Long id) {
        return service.getAllEmailsById(id);
    }

}
