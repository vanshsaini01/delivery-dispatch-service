package com.shirtms.deliverydispatch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shirtms.deliverydispatch.entity.Dispatch;
import com.shirtms.deliverydispatch.repository.DispatchRepository;

@Service
public class DispatchServiceImpl implements DispatchService {

    @Autowired
    private DispatchRepository dispatchRepository;

    @Override
    public Dispatch createDispatch(Dispatch dispatch) {
        return dispatchRepository.save(dispatch);
    }

    @Override
    public Dispatch getDispatchById(Long id) {
        return dispatchRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dispatch not found with ID: " + id));
    }

    @Override
    public List<Dispatch> getAllDispatches() {
        return dispatchRepository.findAll();
    }
}
