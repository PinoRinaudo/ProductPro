package com.pro.productpro.repository;

import com.pro.productpro.compositekeys.OrderProductId;
import com.pro.productpro.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductId> {
}
