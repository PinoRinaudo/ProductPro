package com.pro.productpro.model;

import com.pro.productpro.compositekeys.OrderProductId;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class ProductOrder implements Serializable {
    @EmbeddedId
    private OrderProductId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private OrderInfo order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;


}