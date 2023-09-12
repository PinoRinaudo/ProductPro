package com.pro.productpro.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "Tanti prodotti!";
    }

}
