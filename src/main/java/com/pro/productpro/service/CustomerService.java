package com.pro.productpro.service;

import com.pro.productpro.model.Customer;
import com.pro.productpro.model.Email;
import com.pro.productpro.model.Phone;
import com.pro.productpro.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public Customer createCustomer(Customer customer) {
        if (customer.getPhones() != null)
            for (Phone phone : customer.getPhones())
                phone.setCustomer(customer);
        if (customer.getEmails() != null)
            for (Email email : customer.getEmails())
                email.setCustomer(customer);
        return repository.save(customer);
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer addPhones(Long id, List<Phone> phones) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.getPhones().addAll(phones);
            phones.forEach(phone -> phone.setCustomer(customer));
            repository.save(customer);
            return customer;
        }
        return null;
    }

    public List<Phone> getAllPhonesById(Long id) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        return optionalCustomer.map(Customer::getPhones).orElse(null);
    }
}
