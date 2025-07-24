package com.shirtms.deliverydispatch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "deliveries")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String address;

    private String status;

    // Constructors
    public Delivery() {
    }

    public Delivery(Long id, Long orderId, String address, String status) {
        this.id = id;
        this.orderId = orderId;
        this.address = address;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString()
    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
