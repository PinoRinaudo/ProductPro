package com.pro.productpro.service;

import com.pro.productpro.model.Customer;
import com.pro.productpro.model.Email;
import com.pro.productpro.model.Phone;
import com.pro.productpro.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public Customer addCustomer(Customer customer) {
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

}
