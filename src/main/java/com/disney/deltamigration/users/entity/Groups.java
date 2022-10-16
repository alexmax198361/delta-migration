package com.disney.delta.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Groups {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "vendor_id", nullable = true)
    private Integer vendorId;
    @Basic
    @Column(name = "customer_id", nullable = true)
    private Integer customerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groups groups = (Groups) o;
        return id == groups.id && Objects.equals(name, groups.name) && Objects.equals(vendorId, groups.vendorId) && Objects.equals(customerId, groups.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, vendorId, customerId);
    }
}
