package com.pro.productpro.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pro.productpro.orderproduct.OrderProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private double price;
    private double width;
    private double height;
    private double depth;
    private String linkImage;

    @OneToMany(mappedBy = "product",
            orphanRemoval = true)
    @JsonIgnore
    private List<OrderProduct> orderProducts;
}
