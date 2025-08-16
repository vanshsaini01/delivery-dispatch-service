package com.shirtms.deliverydispatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shirtms.deliverydispatch.entity.DeliveryDispatch;

@Repository
public interface DeliveryDispatchRepository extends JpaRepository<DeliveryDispatch, Long> {

}
