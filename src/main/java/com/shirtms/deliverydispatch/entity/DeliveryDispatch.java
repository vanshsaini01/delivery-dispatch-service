package com.shirtms.deliverydispatch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery_dispatch")
public class DeliveryDispatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;

    private String address;   // from Delivery (optional for Dispatch)

    private String type;      // "DELIVERY" or "DISPATCH"

    private String status;    // common field

    // Constructors
    public DeliveryDispatch() {
    }

    public DeliveryDispatch(Long id, Long orderId, String address, String type, String status) {
        this.id = id;
        this.orderId = orderId;
        this.address = address;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "DeliveryDispatch{"
                + "id=" + id
                + ", orderId=" + orderId
                + ", address='" + address + '\''
                + ", type='" + type + '\''
                + ", status='" + status + '\''
                + '}';
    }
}
