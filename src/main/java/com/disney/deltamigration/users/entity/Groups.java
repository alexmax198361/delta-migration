package com.disney.deltamigration.users.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Groups {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = true, length = 255)
    private String name;

    @Column(name = "vendor_id", nullable = true)
    private Integer vendorId;

    @Column(name = "customer_id", nullable = true)
    private Integer customerId;


}
