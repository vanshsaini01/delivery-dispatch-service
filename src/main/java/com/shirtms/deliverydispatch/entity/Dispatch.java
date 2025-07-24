package com.shirtms.deliverydispatch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dispatches")
public class Dispatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String status;

    // Constructors
    public Dispatch() {
    }

    public Dispatch(Long id, Long orderId, String status) {
        this.id = id;
        this.orderId = orderId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString()
    @Override
    public String toString() {
        return "Dispatch{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", status='" + status + '\'' +
                '}';
    }
}
