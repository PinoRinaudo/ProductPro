package com.pro.productpro.orderinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderInfoController {
    @Autowired
    OrderInfoRepository repository;

    @GetMapping("/orders")
    public List<OrderInfo> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/orders/{id}")
    public int getProduct(@PathVariable int id) {
        return id;
    }

    @GetMapping("/orders/customer/{id}")
    public int getCustomerOrders(@PathVariable int id) {
        return id;
    }

}
