package com.pro.productpro.controller;

import com.pro.productpro.model.OrderProduct;
import com.pro.productpro.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderProductController {
    @Autowired
    OrderProductRepository repository;

    @GetMapping("/orders")
    public List<OrderProduct> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/orders/{id}")
    public int getProduct(@PathVariable int id) {
        return id;
    }

}
