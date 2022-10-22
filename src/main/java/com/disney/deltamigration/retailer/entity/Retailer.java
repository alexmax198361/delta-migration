package com.disney.deltamigration.retailer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Retailer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    
    @Column(name = "param", nullable = true, length = -1)
    private String param;
    
    @Column(name = "code", nullable = true, length = 3)
    private String code;
    
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    
    @Column(name = "childretailers", nullable = true, length = -1)
    private String childretailers;
    
    @Column(name = "notes", nullable = true, length = -1)
    private String notes;
    
    @Column(name = "retailer_active", nullable = true)
    private Byte retailerActive;
    
    @Column(name = "popularity", nullable = true)
    private Integer popularity;
    
    @Column(name = "sale_est", nullable = true)
    private Byte saleEst;
    
    @Column(name = "sale_dadat", nullable = true)
    private Byte saleDadat;
    
    @Column(name = "sale_datg", nullable = true)
    private Byte saleDatg;
    
    @Column(name = "sale_emea", nullable = true)
    private Byte saleEmea;
    
    @Column(name = "storm_account_id", nullable = true)
    private Integer stormAccountId;
    
    @Column(name = "isclientdeliverabledriven", nullable = true)
    private Byte isclientdeliverabledriven;
    
    @Column(name = "is_test_retailer", nullable = false)
    private byte isTestRetailer;
    
    @Column(name = "created_by", nullable = true)
    private Integer createdBy;
    
    @Column(name = "updated_by", nullable = true)
    private Integer updatedBy;
    
    @Column(name = "created_on", nullable = true)
    private Timestamp createdOn;
    
    @Column(name = "updated_on", nullable = true)
    private Timestamp updatedOn;
    
    @Column(name = "accepts_vendor_id", nullable = true)
    private Byte acceptsVendorId;


}
