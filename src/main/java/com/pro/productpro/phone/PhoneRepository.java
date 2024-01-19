package com.pro.productpro.phone;

import com.pro.productpro.phone.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, String> {
}
