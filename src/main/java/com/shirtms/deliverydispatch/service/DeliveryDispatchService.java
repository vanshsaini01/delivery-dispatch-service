package com.shirtms.deliverydispatch.service;

import java.util.List;

import com.shirtms.deliverydispatch.entity.DeliveryDispatch;

public interface DeliveryDispatchService {

    DeliveryDispatch createRecord(DeliveryDispatch record);

    DeliveryDispatch getRecordById(Long id);

    List<DeliveryDispatch> getAllRecords();

    DeliveryDispatch updateRecord(Long id, DeliveryDispatch record);

    void deleteRecord(Long id);
}
