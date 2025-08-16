package com.shirtms.deliverydispatch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shirtms.deliverydispatch.entity.DeliveryDispatch;
import com.shirtms.deliverydispatch.repository.DeliveryDispatchRepository;

@Service
public class DeliveryDispatchServiceImpl implements DeliveryDispatchService {

    @Autowired
    private DeliveryDispatchRepository repository;

    @Override
    public DeliveryDispatch createRecord(DeliveryDispatch record) {
        return repository.save(record);
    }

    @Override
    public DeliveryDispatch getRecordById(Long id) {
        Optional<DeliveryDispatch> record = repository.findById(id);
        return record.orElse(null);
    }

    @Override
    public List<DeliveryDispatch> getAllRecords() {
        return repository.findAll();
    }

    @Override
    public DeliveryDispatch updateRecord(Long id, DeliveryDispatch record) {
        DeliveryDispatch existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setOrderId(record.getOrderId());
            existing.setAddress(record.getAddress());
            existing.setType(record.getType());
            existing.setStatus(record.getStatus());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteRecord(Long id) {
        repository.deleteById(id);
    }
}
