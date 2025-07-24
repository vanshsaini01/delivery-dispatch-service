package com.shirtms.deliverydispatch.service;

import java.util.List;

import com.shirtms.deliverydispatch.entity.Delivery;

public interface DeliveryService {
    Delivery createDelivery(Delivery delivery);
    Delivery getDeliveryById(Long id);
    List<Delivery> getAllDeliveries();
}
