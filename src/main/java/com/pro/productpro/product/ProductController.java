package com.pro.productpro.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductRepository repository;

    @GetMapping
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public int getProduct(@PathVariable int id) {
        return id;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }

}
