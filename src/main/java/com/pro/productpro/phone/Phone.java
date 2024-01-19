package com.pro.productpro.phone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pro.productpro.customer.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Phone implements Serializable {
    @Id
    @Pattern(regexp = "^[0-9]*$", message = "Invalid number format")
    private String number;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonIgnore
    private Customer customer;


}
