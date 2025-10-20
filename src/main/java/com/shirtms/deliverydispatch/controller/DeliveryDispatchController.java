package com.shirtms.deliverydispatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shirtms.deliverydispatch.entity.DeliveryDispatch;
import com.shirtms.deliverydispatch.service.DeliveryDispatchService;

@RestController
@RequestMapping("/api/delivery-dispatch")
public class DeliveryDispatchController {

    @Autowired
    private DeliveryDispatchService deliveryDispatchService;

    @PostMapping
    public DeliveryDispatch createRecord(@RequestBody DeliveryDispatch record) {
        return deliveryDispatchService.createRecord(record);
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Delivery-Dispatch Service is running!";
    }

    //Eureka 
    @GetMapping("/")
    public String home() {
        return "✅ Delivery-Dispatch Service is up and running!";
    }

    @GetMapping("/{id}")
    public DeliveryDispatch getRecordById(@PathVariable Long id) {
        return deliveryDispatchService.getRecordById(id);
    }

    @GetMapping
    public List<DeliveryDispatch> getAllRecords() {
        return deliveryDispatchService.getAllRecords();
    }

    @PutMapping("/{id}")
    public DeliveryDispatch updateRecord(@PathVariable Long id, @RequestBody DeliveryDispatch record) {
        return deliveryDispatchService.updateRecord(id, record);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        deliveryDispatchService.deleteRecord(id);
    }

}
