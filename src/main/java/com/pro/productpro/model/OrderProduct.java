package com.pro.productpro.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pro.productpro.compositekeys.OrderProductId;
import com.pro.productpro.product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class OrderProduct implements Serializable {

    @EmbeddedId
    @JsonIgnore
    private OrderProductId id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    @JsonIgnore
    private OrderInfo order;

    private int quantity;
}
