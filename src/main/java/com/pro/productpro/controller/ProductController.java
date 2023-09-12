package com.pro.productpro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "Tanti prodotti!";
    }

    @GetMapping("/products/{id}")
    public int getProduct(@PathVariable int id) {
        return id;
    }

}
