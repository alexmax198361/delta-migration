package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "retailer_type",  catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RetailerType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "retailer_type_id", nullable = false)
    private int retailerTypeId;

    @Column(name = "retailer_type_name")
    private String name;
    

}
