package com.shirtms.deliverydispatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shirtms.deliverydispatch.entity.Dispatch;
import com.shirtms.deliverydispatch.service.DispatchService;

@RestController
@RequestMapping("/api/dispatches")
public class DispatchController {

    @Autowired
    private DispatchService dispatchService;

    @PostMapping
    public Dispatch createDispatch(@RequestBody Dispatch dispatch) {
        return dispatchService.createDispatch(dispatch);
    }

    @GetMapping("/{id}")
    public Dispatch getDispatchById(@PathVariable Long id) {
        return dispatchService.getDispatchById(id);
    }

    @GetMapping
    public List<Dispatch> getAllDispatches() {
        return dispatchService.getAllDispatches();
    }
}
