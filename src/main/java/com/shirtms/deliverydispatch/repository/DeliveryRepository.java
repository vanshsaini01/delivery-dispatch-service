package com.shirtms.deliverydispatch.repository;

import com.shirtms.deliverydispatch.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
