package com.shirtms.deliverydispatch.service;

import java.util.List;

import com.shirtms.deliverydispatch.entity.Dispatch;

public interface DispatchService {
    Dispatch createDispatch(Dispatch dispatch);
    Dispatch getDispatchById(Long id);
    List<Dispatch> getAllDispatches();
}
