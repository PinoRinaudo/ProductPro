package com.pro.productpro.repository;

import com.pro.productpro.compositekeys.ProductOrderId;
import com.pro.productpro.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, ProductOrderId> {
}
