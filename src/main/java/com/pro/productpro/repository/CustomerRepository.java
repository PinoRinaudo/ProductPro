package com.pro.productpro.repository;

import com.pro.productpro.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Product, Long> {
}
