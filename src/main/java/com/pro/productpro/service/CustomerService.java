package com.pro.productpro.service;

import com.pro.productpro.model.Customer;
import com.pro.productpro.model.Email;
import com.pro.productpro.model.OrderInfo;
import com.pro.productpro.model.Phone;
import com.pro.productpro.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        if (customer.getPhones() != null) for (Phone phone : customer.getPhones())
            phone.setCustomer(customer);
        if (customer.getEmails() != null) for (Email email : customer.getEmails())
            email.setCustomer(customer);
        return repository.save(customer);
    }

    public <T> void updateList(List<T> oldList, List<T> newList) {
        if (newList != null) {
            oldList.clear();
            oldList.addAll(newList);
        }
    }

    public <T> void applyInList(List<T> list, Consumer<T> consumer) {
        if (list != null)
            list.forEach(consumer);

    }

    public Customer updateCustomer(Long id, Customer newCustomer) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer oldCustomer = optionalCustomer.get();
            oldCustomer.setName(newCustomer.getName());
            updateList(oldCustomer.getPhones(), newCustomer.getPhones());
            updateList(oldCustomer.getEmails(), newCustomer.getEmails());
            updateList(oldCustomer.getOrders(), newCustomer.getOrders());

            applyInList(oldCustomer.getPhones(), e -> e.setCustomer(oldCustomer));
            applyInList(oldCustomer.getEmails(), e -> e.setCustomer(oldCustomer));
            applyInList(oldCustomer.getOrders(), e -> e.setCustomer(oldCustomer));

            repository.save(oldCustomer);
            return oldCustomer;
        }
        return null;

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

    public Customer addEmails(Long id, List<Email> emails) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.getEmails().addAll(emails);
            emails.forEach(email -> email.setCustomer(customer));
            repository.save(customer);
            return customer;
        }
        return null;
    }

    public List<Email> getAllEmailsById(Long id) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        return optionalCustomer.map(Customer::getEmails).orElse(null);
    }

    public List<OrderInfo> getAllOrdersById(Long id) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            return customer.getOrders();
        }
        return null;
    }

    public Customer deletePhones(Long id, String number) {
        Optional<Customer> optionalCustomer = repository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.getPhones().removeIf(phone -> Objects.equals(phone.getNumber(), number));
            repository.save(customer);
            return customer;
        }
        return null;
    }


}
